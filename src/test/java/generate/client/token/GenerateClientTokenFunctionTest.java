package generate.client.token;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class GenerateClientTokenFunctionTest {

    @Inject
    GenerateClientTokenClient client;

    @Test
    public void testFunction() {
    	GenerateClientToken body = new GenerateClientToken();
    	body.setName("generate-client-token");
        assertEquals("generate-client-token", client.apply(body).blockingGet().getName());
    }
}
