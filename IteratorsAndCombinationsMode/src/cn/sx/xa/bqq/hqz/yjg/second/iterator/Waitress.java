package cn.sx.xa.bqq.hqz.yjg.second.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.second.DinerMenu;
import cn.sx.xa.bqq.hqz.yjg.second.Menu;
import cn.sx.xa.bqq.hqz.yjg.second.MeunItem;
import cn.sx.xa.bqq.hqz.yjg.second.PancakeHouseMenu;
import cn.sx.xa.bqq.hqz.yjg.second.Staff;

public class Waitress implements Staff {
	
	ArrayList<Menu> meunItems;
	
	@Override
	public void printMenu() {
		Iterator<Menu> iterator = meunItems.iterator();
		while (iterator.hasNext()) {
			Menu menu = iterator.next();
			printMenu(menu.createrIterator(), null);
		}
	}

	@Override
	public void printBreakfastMenu() {
		
	}

	@Override
	public void printLunchMenu() {

	}

	@Override
	public void printVegetarianMenu() {
		
	}

	@Override
	public boolean isItemVegetarian(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public Waitress(ArrayList<Menu> meunItems) {
		this.meunItems = meunItems;
	}

	private void printMenu(Iterator<MeunItem> iterator, Boolean status) {
		while (iterator.hasNext()) {
			MeunItem item = iterator.next();
			if (status == null) {
				System.out.println(
						item.getName() + "------------" + item.getPrice() + "---------------" + item.getDescription());
			}else if(status){
				if(item.isVegetarian()){
				System.out.println(
						item.getName() + "------------" + item.getPrice() + "---------------" + item.getDescription());
				}
			}
		}
	}
	
}
