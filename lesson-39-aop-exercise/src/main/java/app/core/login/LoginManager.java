package app.core.login;

import org.springframework.stereotype.Component;

@Component
public class LoginManager {

	private boolean logged;

	public boolean login(String name, String password) {
		this.logged = true;
		return this.logged;
	}

	public boolean isLogged() {
		return logged;
	}

}
