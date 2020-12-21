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

}
