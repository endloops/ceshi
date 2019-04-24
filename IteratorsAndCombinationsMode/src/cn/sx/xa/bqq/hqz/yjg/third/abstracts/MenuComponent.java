package cn.sx.xa.bqq.hqz.yjg.third.abstracts;

import java.util.Iterator;

//组合总类
public abstract class MenuComponent {
	
	public void add(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent component){
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public String getDescription(){
		throw new UnsupportedOperationException();
	}
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarion(){
		throw new UnsupportedOperationException();
	}
	public void print(){
		throw new UnsupportedOperationException();
	}
	public Iterator createIterator(){
		throw new UnsupportedOperationException();
	}
}
