package kz.devyellow.RestoApp.modules.menu.controller;

import kz.devyellow.RestoApp.modules.menu.entity.Food;
import kz.devyellow.RestoApp.modules.menu.services.MenuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menuList")
public class MenuListController {

	@Autowired
	MenuListService service;

	@GetMapping("all")
	public List<Food> getMenu() {
		return service.getAll();
	}

	@GetMapping("/search/{searchText}")
	public List<Food> getMenuItems(@PathVariable String searchText) {
		return service.getMenuItemsByName(searchText);
	}

	@GetMapping("/{id}")
	public Food getMenuItem(@PathVariable Long id) {
		Food item = new Food();
		if (service.getItemById(id).isPresent()) {
			item = service.getItemById(id).get();
		}
		return item;
	}


}
