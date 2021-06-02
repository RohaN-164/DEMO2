package com.hotelservice.hotelservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelservice.hotelservice.bean.Menu;

@Service
public class CartServiceImpl implements CartService{

	List<Menu> cart;
	
	public CartServiceImpl() {
		cart = new ArrayList<>();
	}

	@Override
	public List<Menu> viewCart() {
		// TODO Auto-generated method stub
		return cart;
	}

	@Override
	public List<Menu> addToCart(Menu menu) {
		// TODO Auto-generated method stub
		cart.add(menu);
		return cart;
	}

	@Override
	public String deleteCart(int menuId) {
		// TODO Auto-generated method stub
		for(Menu item:cart) {
			if(item.getId()==menuId) {
				cart.remove(item);
				break;
			}
		}
		return "Deleted Successfully from Cart";
	}

}
