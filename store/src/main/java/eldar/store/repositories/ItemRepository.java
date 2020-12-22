package eldar.store.repositories;

import org.springframework.data.repository.CrudRepository;

import eldar.store.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

//	@Query("from Basket b where b.item.id= :itemId")
//	Basket findBasketByItemId(Integer itemId);

}
