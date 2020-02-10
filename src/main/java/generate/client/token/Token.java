package generate.client.token;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Token {
	private String token;

	public Token(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
