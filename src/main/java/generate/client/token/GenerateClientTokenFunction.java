package generate.client.token;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.ClientTokenRequest;
import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("generate-client-token")
public class GenerateClientTokenFunction extends FunctionInitializer implements Function<GenerateClientToken, Token> {
	private static BraintreeGateway gateway = Application.gateway;

	@Override
	public Token apply(GenerateClientToken msg) {
		return new Token(gateway.clientToken().generate(new ClientTokenRequest().customerId(msg.getCustomerId())));
	}

	/**
	 * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar
	 * where the argument to echo is the JSON to be parsed.
	 */
	public static void main(String... args) throws IOException {
		File file = new File("gateway.properties");
		if(file.exists())
			gateway = BraintreeGatewayFactory.fromConfigFile(file);
		else
			gateway = BraintreeGatewayFactory.fromConfigMapping(System.getenv());
		GenerateClientTokenFunction function = new GenerateClientTokenFunction();
		function.run(args, (context) -> function.apply(context.get(GenerateClientToken.class)));
	}
}

