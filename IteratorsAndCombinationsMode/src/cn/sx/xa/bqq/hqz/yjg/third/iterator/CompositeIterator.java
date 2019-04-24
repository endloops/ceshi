package cn.sx.xa.bqq.hqz.yjg.third.iterator;

import java.util.Iterator;
import java.util.Stack;

import cn.sx.xa.bqq.hqz.yjg.third.Menu;
import cn.sx.xa.bqq.hqz.yjg.third.abstracts.MenuComponent;

public class CompositeIterator implements Iterator{

	@SuppressWarnings("rawtypes")
	public static Stack<Iterator> stack =new Stack<>();
	
	
	
	@Override
	public boolean hasNext() {
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public MenuComponent next() {
		if(hasNext()){
			Iterator iterator = stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu){
				stack.push(((Menu) component).createIterator());
			}
			return component;
		}else{
			return null;
		}
	}

}
