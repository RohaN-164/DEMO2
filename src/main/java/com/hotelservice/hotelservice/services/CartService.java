package com.hotelservice.hotelservice.services;

import java.util.List;

import com.hotelservice.hotelservice.bean.Menu;

public interface CartService {
	
	public List<Menu> viewCart();
	
	public List<Menu> addToCart(Menu menu);

	public String deleteCart(int menuId);

}
