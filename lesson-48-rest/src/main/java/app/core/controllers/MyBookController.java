package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Book;

@RestController
@RequestMapping("/api/books")
public class MyBookController {

	private List<Book> books = new ArrayList<>();
	private int id = 0;

	@PostMapping(path = "/book", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public int add(@RequestBody Book book) {
		book.setId(++id);
		books.add(book);
		System.out.println(books);
		return id;
	}

	@GetMapping(path = "/book/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Book get(@PathVariable int id) {
		Book book = new Book(id, null);
		int index = books.indexOf(book);
		if (index != -1) {
			return books.get(index);
		} else {
			return null;
		}
	}

}
