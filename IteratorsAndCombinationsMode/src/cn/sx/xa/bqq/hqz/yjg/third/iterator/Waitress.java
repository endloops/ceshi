package cn.sx.xa.bqq.hqz.yjg.third.iterator;

import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.third.Staff;
import cn.sx.xa.bqq.hqz.yjg.third.abstracts.MenuComponent;

public class Waitress implements Staff {
	
	MenuComponent menucomponent;
	
	@Override
	public void printMenu() {
		menucomponent.print();
	}

	@Override
	public void printBreakfastMenu() {
		
	}

	@Override
	public void printLunchMenu() {

	}

	@Override
	public void printVegetarianMenu() {
		Iterator iterator = menucomponent.createIterator();
		System.out.println("\n VEGETARIAN FOOD----------");
		while (iterator.hasNext()) {
			MenuComponent object = (MenuComponent) iterator.next();
			try {
				System.out.println("vegat"+object.isVegetarion());
				if(object.isVegetarion()){
					object.print();
				}
			} catch (Exception e) {
				
			}
		}
	}

	@Override
	public boolean isItemVegetarian(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public Waitress(MenuComponent menucomponent) {
		this.menucomponent = menucomponent;
	}

	
	
}
