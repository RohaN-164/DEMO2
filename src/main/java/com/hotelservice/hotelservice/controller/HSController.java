package com.hotelservice.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelservice.hotelservice.bean.Menu;
import com.hotelservice.hotelservice.services.CartService;
import com.hotelservice.hotelservice.services.MenuService;

@RestController
public class HSController {
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private CartService cartService;
	
	@GetMapping("/HS")
	public String hotelService() {
		return "Welcome";
	}
	
	//MENU
	@GetMapping("/Menu")
	public List<Menu> viewMenu(){
		return this.menuService.viewMenu();
	}
	
	@GetMapping("/Menu/{menuId}")
	public Menu viewMenu(@PathVariable int menuId) {
		return this.menuService.viewMenu(menuId);
	}
	
	@PostMapping("/Menu")
	public Menu addToMenu(@RequestBody Menu menu) {
		return this.menuService.addToMenu(menu);
	}
	
	@PutMapping("/Menu")
	public Menu updateMenu(@RequestBody Menu menu) {
		return this.menuService.updateMenu(menu);
	}
	
	@DeleteMapping("/Menu/{menuId}")
	public String deleteMenu(@PathVariable int menuId) {
		return this.menuService.deleteMenu(menuId);
	}
	
	//CART
	@GetMapping("/Cart")
	public List<Menu> viewCart(){
		return this.cartService.viewCart();
	}
	
	@PostMapping("/Cart/{menuId}")
	public List<Menu> addToCart(@PathVariable int menuId) {
		return this.cartService.addToCart(this.menuService.viewMenu(menuId));
	}
	
	@DeleteMapping("/Cart/{menuId}")
	public String deleteCart(@PathVariable int menuId) {
		return this.cartService.deleteCart(menuId);
	}
	
}
