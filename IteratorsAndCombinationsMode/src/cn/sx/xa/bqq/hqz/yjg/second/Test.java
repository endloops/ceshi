package cn.sx.xa.bqq.hqz.yjg.second;

import java.util.ArrayList;

import cn.sx.xa.bqq.hqz.yjg.second.iterator.Waitress;

public class Test {
	public static void main(String[] args) {
		PancakeHouseMenu pancakes = new PancakeHouseMenu();
		DinerMenu diners = new DinerMenu();
		ArrayList<Menu> arrayList = new ArrayList<>();
		arrayList.add(pancakes);
		arrayList.add(diners);
		Waitress waitress = new Waitress(arrayList);
		waitress.printBreakfastMenu();
		waitress.printLunchMenu();
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
