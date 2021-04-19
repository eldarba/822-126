package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Product;
import app.core.exceptions.ProductWebsiteException;
import app.core.services.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@PostMapping("/create")
	public Product create(@RequestBody Product product, @RequestHeader String token, @RequestHeader int num,
			@RequestHeader String startDate) {
		System.out.println("======== TOKEN: " + token + ", num=" + num + ", start date is: " + startDate);
		try {
			return this.productService.create(product);
		} catch (ProductWebsiteException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}

	@GetMapping("/read")
	public Product read(@RequestParam int id) {
		try {

//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			return this.productService.read(id);
		} catch (ProductWebsiteException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}

	@GetMapping("/read/all")
	public List<Product> read() {
		try {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return this.productService.readAll();
		} catch (ProductWebsiteException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}

	@PutMapping("/update")
	public void update(@RequestBody Product product) {
		try {
			this.productService.update(product);
		} catch (ProductWebsiteException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}

	@DeleteMapping("/delete")
	public void delete(@RequestParam int id) {
		try {
			this.productService.delete(id);
		} catch (ProductWebsiteException e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage(), e);
		}
	}

}
