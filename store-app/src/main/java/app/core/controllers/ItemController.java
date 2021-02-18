package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Item;

@RestController
@CrossOrigin
public class ItemController {

	private List<Item> items = new ArrayList<Item>();
	private int currId;

	@PostMapping("/items")
	public int save(@RequestBody Item item) {
		System.out.println(item);
		item.setId(++currId);
		items.add(item);
		return currId;
	}

	@GetMapping("/items/{id}")
	public Item getOne(@PathVariable int id) {
		Item item = new Item(id);
		int i = items.indexOf(item);
		if (i != -1) {
			return items.get(i);
		} else {
			return null;
		}
	}

	@GetMapping("/items")
	public List<Item> getAll() {
		return items;
	}

	@PutMapping("/items")
	public Item update(@RequestBody Item item) {
		int i = items.indexOf(item);
		if (i != -1) {
			Item savedItem = items.get(i);
			savedItem.setName(item.getName());
			savedItem.setPrice(item.getPrice());
			return savedItem;
		} else {
			return null;
		}
	}

	@DeleteMapping("/items/{id}")
	public boolean delete(@PathVariable int id) {
		Item item = new Item(id);
		return items.remove(item);
	}

	@DeleteMapping("/items")
	public void deleteAll() {
		items.clear();
	}

}
