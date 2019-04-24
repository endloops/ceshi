package cn.sx.xa.bqq.hqz.yjg.first.iterator;

import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.first.DinerMenu;
import cn.sx.xa.bqq.hqz.yjg.first.Menu;
import cn.sx.xa.bqq.hqz.yjg.first.MeunItem;
import cn.sx.xa.bqq.hqz.yjg.first.PancakeHouseMenu;
import cn.sx.xa.bqq.hqz.yjg.first.Staff;

public class Waitress implements Staff {

	Menu pancakes;

	Menu diners;

	@Override
	public void printMenu() {
		Iterator<MeunItem> panke = pancakes.createrIterator();
		Iterator<MeunItem> diner = diners.createrIterator();
		System.out.println("panke-------------");
		printMenu(panke,null);
		System.out.println("diner-------------");
		printMenu(diner,null);
	}

	@Override
	public void printBreakfastMenu() {
		System.out.println("breakfase-----------------");
		Iterator<MeunItem> panke = pancakes.createrIterator();
		printMenu(panke,null);
	}

	@Override
	public void printLunchMenu() {
		System.out.println("Lunch-----------------");
		Iterator<MeunItem> diner = diners.createrIterator();
		printMenu(diner,null);
	}

	@Override
	public void printVegetarianMenu() {
		System.out.println("Vegetarian-----------------");
		Iterator<MeunItem> panke = pancakes.createrIterator();
		Iterator<MeunItem> diner = diners.createrIterator();
		printMenu(panke,true);
		printMenu(diner,true);
	}

	@Override
	public boolean isItemVegetarian(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public Waitress(PancakeHouseMenu pancakes, DinerMenu diners) {
		this.pancakes = pancakes;
		this.diners = diners;
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
