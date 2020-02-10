package generate.client.token;

import io.micronaut.core.annotation.*;

@Introspected
public class GenerateClientToken {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

