package cn.sx.xa.bqq.hqz.yjg.first;

import java.util.ArrayList;
import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.first.iterator.DinerMenuIterator;

//餐厅菜单
public class DinerMenu implements Menu{
	
	static final int Max_ITIMES = 6;
	
	int numberOfItems = 0;

	MeunItem[] meunItems;

	public DinerMenu() {
		meunItems = new MeunItem[Max_ITIMES];
		addItem("SB's diner lunch", "diner with scrambled eggs, and toast", true, 2.99);
		addItem("Regular diner lunch", "diner with fried eggs, sausage", false, 2.99);
		addItem("Blueberry diner lunch", "diner made with fresh blueberries", true, 3.49);
		addItem("Waffles diner ", "diner, with your choice of blueberries or strawberries", true, 3.59);
		addItem("223", "diner made with fresh blueberries", true, 3.49);
		addItem("113", "diner, with your choice of blueberries or strawberries", true, 3.59);

	}
	

	public void addItem(String name,String description,boolean vegetarian,
			double price){
		
		MeunItem meunItem = new MeunItem(name, description, vegetarian, price);
		
		if(numberOfItems>=Max_ITIMES){
			System.out.println("we do not have others");
		}else{
		
			meunItems[numberOfItems] = meunItem;
			
			numberOfItems++;
		}
	}
	
	
	public MeunItem[] getMenuItems(){
		return meunItems;
	}
	@Override
	public Iterator<MeunItem> createrIterator(){
		return new DinerMenuIterator(meunItems);
	}
}
