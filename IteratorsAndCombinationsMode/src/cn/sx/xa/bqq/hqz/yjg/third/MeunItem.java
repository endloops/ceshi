package cn.sx.xa.bqq.hqz.yjg.third;

import cn.sx.xa.bqq.hqz.yjg.third.abstracts.MenuComponent;

//组合中的页类实现具体细节
public class MeunItem extends MenuComponent{
	String name;
	String description;
	boolean vegetarion;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isVegetarion() {
		return vegetarion;
	}
	public void setVegetarion(boolean vegetarion) {
		this.vegetarion = vegetarion;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public MeunItem(String name, String description, boolean vegetarion, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarion = vegetarion;
		this.price = price;
	}
	public MeunItem() {
		super();
	}
	@Override
	public void print() {
		System.out.println(""+getName());
		if(isVegetarion()){
			System.out.println("(V)");
		}
		System.out.println(","+getPrice());
		System.out.println("---"+getDescription());
		System.out.println("-----------------"+toString()+"---------------");
	}
}
