package app.core.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// allow  the live server origin (5500) request this origin (8080)
@CrossOrigin(origins = { "http://127.0.0.1:5500" })
public class RandomeController {

	@GetMapping("/api/rnd")
	public int getRandom() {
		System.out.println(">>> server");
		return (int) (Math.random() * 101);
	}

}
