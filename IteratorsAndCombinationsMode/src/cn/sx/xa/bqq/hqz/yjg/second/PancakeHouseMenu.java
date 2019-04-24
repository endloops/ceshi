package cn.sx.xa.bqq.hqz.yjg.second;

import java.util.ArrayList;
import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.second.iterator.PancakeHouseMenuIterator;



//煎饼屋
public class PancakeHouseMenu implements Menu{
	
	ArrayList<MeunItem> menuItems;
	
	public PancakeHouseMenu() {
		
		menuItems = new ArrayList<>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
		
	}


	public void addItem(String name,String description,boolean vegetarian,
			double price){
		MeunItem meunItem = new MeunItem(name, description, vegetarian, price);
		menuItems.add(meunItem);
	}
	
	
	public ArrayList<MeunItem> getMenuItems(){
		return menuItems;
	}
	@Override
	public Iterator<MeunItem> createrIterator(){
		return new PancakeHouseMenuIterator(menuItems);
	}
	
}
