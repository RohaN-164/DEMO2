package com.hotelservice.hotelservice.services;

import java.util.List;

import com.hotelservice.hotelservice.bean.Menu;

public interface MenuService {

	public List<Menu> viewMenu();

	public Menu viewMenu(int menuId);

	public Menu addToMenu(Menu menu);

	public Menu updateMenu(Menu menu);

	public String deleteMenu(int menuId);
}
