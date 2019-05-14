package kz.devyellow.RestoApp.modules.menu.services;

import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;
import kz.devyellow.RestoApp.modules.menu.repository.MenuListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuListService {

	@Autowired
	MenuListRepository repository;

	public List<MenuItem> getMenuItemsByName(String name) {
		return repository.findByNomination(name);
	}


	public List<MenuItem> getAll() {
		return repository.findAll();
	}




}
