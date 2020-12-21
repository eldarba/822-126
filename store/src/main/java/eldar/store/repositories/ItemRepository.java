package eldar.store.repositories;

import org.springframework.data.repository.CrudRepository;

import eldar.store.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
