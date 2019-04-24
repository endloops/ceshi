package cn.sx.xa.bqq.hqz.yjg.third;

import cn.sx.xa.bqq.hqz.yjg.third.abstracts.MenuComponent;
import cn.sx.xa.bqq.hqz.yjg.third.iterator.Waitress;

public class Test {
	public static void main(String[] args) {
		MenuComponent panke = new Menu("pancake", "pancake tototototo");
		MenuComponent diner = new Menu("diner", "diner tototototo");
		MenuComponent coffe = new Menu("coffee", "coffee tototototo");
		MenuComponent dessert = new Menu("dessert", "dessert tototototo");
		
		MenuComponent allMenus = new Menu("All Meuns", "All menus tototototoot");

		allMenus.add(panke);
		allMenus.add(diner);
		allMenus.add(coffe);
		
		dessert.add(new MeunItem("tian dian", "tian dian totototo", true, 8.99));

		diner.add(dessert);
		
		diner.add(new MeunItem("xi fan", "xi fan totototo", true, 9.99));
		panke.add(new MeunItem("jian bing", "jian bing totototo", true, 7.99));
		coffe.add(new MeunItem("ka fei", "ka fei totototo", true, 6.99));
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		System.out.println("------------------------------华丽的分割线--------------------");
		waitress.printVegetarianMenu();
			}
}
