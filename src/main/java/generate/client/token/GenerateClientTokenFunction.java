package generate.client.token;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;
import javax.inject.*;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("generate-client-token")
public class GenerateClientTokenFunction extends FunctionInitializer implements Function<GenerateClientToken, GenerateClientToken> {

    @Override
    public GenerateClientToken apply(GenerateClientToken msg) {
         return msg;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        GenerateClientTokenFunction function = new GenerateClientTokenFunction();
        function.run(args, (context)-> function.apply(context.get(GenerateClientToken.class)));
    }    
}

