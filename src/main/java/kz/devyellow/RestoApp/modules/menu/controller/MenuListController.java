package kz.devyellow.RestoApp.modules.menu.controller;

import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;
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
	public List<MenuItem> getMenu() {
		return service.getAll();
	}

	@GetMapping("/employees/{searchText}")
	public List<MenuItem> getMenuItems(@PathVariable String searchText) {
		return service.getMenuItemsByName(searchText);
	}


}