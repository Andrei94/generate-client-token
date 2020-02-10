package generate.client.token;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface GenerateClientTokenClient {

    @Named("generate-client-token")
    Single<GenerateClientToken> apply(@Body GenerateClientToken body);

}
