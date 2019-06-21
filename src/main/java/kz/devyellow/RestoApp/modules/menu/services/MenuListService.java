package kz.devyellow.RestoApp.modules.menu.services;

import kz.devyellow.RestoApp.modules.menu.entity.Food;
import kz.devyellow.RestoApp.modules.menu.repository.MenuListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuListService {

	@Autowired
	MenuListRepository repository;

	public List<Food> getMenuItemsByName(String name) {
		return repository.findByNominationContaining(name);
	}


	public List<Food> getAll() {
		return repository.findAll();
	}

	public Optional<Food> getItemById(Long id) {
		return repository.findById(id);
	}






}
