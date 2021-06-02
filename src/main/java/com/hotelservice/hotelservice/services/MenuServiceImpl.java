package com.hotelservice.hotelservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelservice.hotelservice.bean.Menu;

@Service
public class MenuServiceImpl implements MenuService {

	List<Menu> menu;
	
	public MenuServiceImpl() {
		menu = new ArrayList<>();
		menu.add(new Menu(01,"Toast",30.0));
		menu.add(new Menu(02,"Cheese Sandwich",60.0));
		menu.add(new Menu(03,"Pizza",150.0));
		menu.add(new Menu(04,"Samosa",20.0));
	}

	@Override
	public List<Menu> viewMenu() {
		// TODO Auto-generated method stub
		return menu;
	}

	@Override
	public Menu viewMenu(int menuId) {
		// TODO Auto-generated method stub
		Menu noOfItem=null;
		for(Menu item:menu) {
			if(item.getId()==menuId) {
				noOfItem=item;
				break;
			}
		}
		return noOfItem;
	}

	@Override
	public Menu addToMenu(Menu item) {
		// TODO Auto-generated method stub
		menu.add(item);
		return item;
	}

	@Override
	public Menu updateMenu(Menu item) {
		// TODO Auto-generated method stub
		for(Menu thatItem:menu) {
			if(thatItem.getId()==item.getId()) {
				thatItem.setName(item.getName());
				thatItem.setPrice(item.getPrice());
			}
		}
		return item;
	}

	@Override
	public String deleteMenu(int menuId) {
		// TODO Auto-generated method stub
		for(Menu item:menu) {
			if(item.getId()==menuId) {
				menu.remove(item);
				break;
			}
		}
		return "Deleted Successfully from Menu";
	}
		
}
