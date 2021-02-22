package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.session.Session;
import app.core.session.SessionContext;

@CrossOrigin
@RestController
public class LoginController {

	@Autowired
	private SessionContext sessionContext;

	@PostMapping("/login/{userName}")
	public String login(@PathVariable String userName) {
		Session session = sessionContext.createSession();
		session.setAttribute("userName", userName);
		return session.token;
	}

}
