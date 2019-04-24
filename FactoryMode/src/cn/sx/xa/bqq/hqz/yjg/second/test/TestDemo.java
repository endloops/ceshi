package cn.sx.xa.bqq.hqz.yjg.second.test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import cn.sx.xa.bqq.hqz.yjg.second.BeiJingBiscuitStore;
import cn.sx.xa.bqq.hqz.yjg.second.BiscuitStore;
import cn.sx.xa.bqq.hqz.yjg.second.XiAnBiscuitStore;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;
import cn.sx.xa.bqq.hqz.yjg.second.observerable.Customer;

public class TestDemo {
	public static void main(String[] args) throws FileNotFoundException {
		//testFactoryAndDecorator();
		testFactoryAndDecoratorAndObserver();
	}
	
	public static void testFactoryAndDecorator(){
		BiscuitStore beijing = new BeiJingBiscuitStore();
		Biscuit material = beijing.orderBiscuit("大麦,红豆");
		//BiscuitStore xian = new XiAnBiscuitStore();
		//material = xian.orderBiscuit("大麦");
	}
	public static void testFactoryAndDecoratorAndObserver(){
		Customer customer = new Customer("张皮蛋");
		customer.orderBiscuit("西安", "大麦,红豆");
	}
}
