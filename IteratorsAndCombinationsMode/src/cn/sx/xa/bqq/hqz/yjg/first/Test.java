package cn.sx.xa.bqq.hqz.yjg.first;

import cn.sx.xa.bqq.hqz.yjg.first.iterator.Waitress;

public class Test {
	public static void main(String[] args) {
		PancakeHouseMenu pancakes = new PancakeHouseMenu();
		DinerMenu diners = new DinerMenu();
		Waitress waitress = new Waitress(pancakes, diners);
		waitress.printBreakfastMenu();
		waitress.printLunchMenu();
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
