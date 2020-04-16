package generate.client.token;

import io.micronaut.core.annotation.*;

@Introspected
public class GenerateClientToken {

    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}