package eldar.store.repositories;

import org.springframework.data.repository.CrudRepository;

import eldar.store.entities.Basket;

public interface BasketRepository extends CrudRepository<Basket, Integer> {

}
