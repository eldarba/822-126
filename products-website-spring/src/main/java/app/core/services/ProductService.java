package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Product;
import app.core.exceptions.ProductWebsiteException;
import app.core.repositories.ProductReposiory;

@Service
@Transactional
public class ProductService {

	private ProductReposiory productReposiory;

	@Autowired
	public ProductService(ProductReposiory productReposiory) {
		super();
		this.productReposiory = productReposiory;
	}

	public Product create(Product product) throws ProductWebsiteException {
		try {
			return productReposiory.save(product);
		} catch (Exception e) {
			throw new ProductWebsiteException("create product failed", e);
		}
	}

	public Product read(int id) throws ProductWebsiteException {
		try {
			Optional<Product> opt = productReposiory.findById(id);
			if (opt.isPresent()) {
				return opt.get();
			}
		} catch (Exception e) {
			throw new ProductWebsiteException("read product failed", e);
		}
		throw new ProductWebsiteException("product with id " + id + " not found");
	}

	public List<Product> readAll() throws ProductWebsiteException {
		try {
			return productReposiory.findAll();
		} catch (Exception e) {
			throw new ProductWebsiteException("read all products failed", e);
		}
	}

	public void update(Product product) throws ProductWebsiteException {
		try {
			Product productPersistent = read(product.getId());
			productPersistent.setName(product.getName());
			productPersistent.setPrice(product.getPrice());
			productPersistent.setStock(product.getStock());
		} catch (Exception e) {
			throw new ProductWebsiteException("update product failed", e);
		}
	}

	public void delete(int id) throws ProductWebsiteException {
		try {
			read(id);
			this.productReposiory.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace(System.out);
			throw new ProductWebsiteException("delete product failed", e);
		}
	}

}
