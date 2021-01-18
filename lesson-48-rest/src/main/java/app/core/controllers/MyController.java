package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	private List<String> list = new ArrayList<String>();

	// CREATE - add a representation to the server
	@PostMapping("/hello")
	public String hello1(@RequestBody String str) {
		list.add(str);
		System.out.println(list);
		return "hello1 - post";
	}

	// READ - get a representation from the server
	@GetMapping("/hello/{index}")
	public String hello2(@PathVariable int index) {
		String str = null;
		if (index < list.size()) {
			str = list.get(index);
		}
		return "hello2 - get: " + str;
	}

	@GetMapping("/hello")
	public List<String> hello2All() {
		return list;
	}

	// UPDATE - update a representation on the server
	@PutMapping("/hello")
	public String hello3(@RequestBody String newVal, @RequestParam int index) {
		if (index < list.size()) {
			list.set(index, newVal);
			return "hello3 - updated";
		} else {
			return "hello3 - NOT updated";
		}
	}

	// DELETE
	@DeleteMapping("/hello")
	public String hello4(@RequestParam(required = false, name = "i") Integer index) {
		if (index == null) {
			list.remove(list.size() - 1);
		} else if (index < list.size()) {
			list.remove((int) index);
		}
		return "hello4 - delete";
	}

}
