package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Product;

public interface ProductReposiory extends JpaRepository<Product, Integer> {

}
