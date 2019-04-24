package cn.sx.xa.bqq.hqz.yjg.third;

import java.util.ArrayList;
import java.util.Iterator;

import cn.sx.xa.bqq.hqz.yjg.third.abstracts.MenuComponent;
import cn.sx.xa.bqq.hqz.yjg.third.iterator.CompositeIterator;
//组合中的组合菜单（树枝类（管理子节点））
public class Menu extends MenuComponent{
	ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;
	
	public Menu(String name, String description){
		this.name = name;
		this.description = description;
	}
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public void print(){
		System.out.println("\n"+getName());
		System.out.println(","+getDescription());
		System.out.println("-----------------------");
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menu = iterator.next();
			menu.print();
		}
	}
	@Override
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
}
