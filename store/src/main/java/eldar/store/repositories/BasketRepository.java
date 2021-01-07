package eldar.store.repositories;

import org.springframework.data.repository.CrudRepository;

import eldar.store.entities.Basket;

public interface BasketRepository extends CrudRepository<Basket, Integer> {

//	@Query(value =  "select I.basket from item as I where i.id= itemid", nativeQuery = true)
//	@Query("from Basket b where b.items.id=:itemId")
//	Basket findBasketByItemId(Integer itemId);

//	Basket findByItemsId(Integer itemId);
}
