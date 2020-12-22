package eldar.store.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eldar.store.entities.Basket;
import eldar.store.entities.Item;
import eldar.store.repositories.BasketRepository;
import eldar.store.repositories.ItemRepository;

@Service
@Transactional
public class Store {

	@Autowired
	private BasketRepository basketRepository;
	@Autowired
	private ItemRepository itemRepository;

	public void addBasket(Basket basket) {
		basketRepository.save(basket);
	}

	public void addItem(Integer basketId, Item item) {
		Optional<Basket> opt = basketRepository.findById(basketId);
		if (opt.isPresent()) {
			Basket basket = opt.get();
			basket.addItem(item);
		} else {
			System.out.println("basket id " + basketId + " not found");
		}
	}

	public void deleteBasket(Integer basketId) {
		basketRepository.deleteById(basketId);
	}

	public Item getItem(Integer itemId) {
		Optional<Item> opt = itemRepository.findById(itemId);
		if (opt.isPresent()) {
			return opt.get();
		}

		return null;
	}

	public Basket getBasket(Integer basketId) {
		Optional<Basket> opt = basketRepository.findById(basketId);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	public Basket getBasketByItem(Integer itemId) {
		Optional<Item> opt = itemRepository.findById(itemId);
		if (opt.isPresent()) {
			Item item = opt.get();
			return item.getBasket();
		}
		return null;
	}

	public Basket getBasketByItem2(Integer itemId) {
		return basketRepository.findByItemsId(itemId);
	}
//	public Basket getBasketByItem2(Integer itemId) {
//		return basketRepository.findBasketByItemId(itemId);
//	}

	// add methods:
	// 0. make the relationship of basket-item bidirectional
	// 1. get basket by basket id
	// 2. get basket by item id

}
