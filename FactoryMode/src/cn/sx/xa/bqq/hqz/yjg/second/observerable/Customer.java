package cn.sx.xa.bqq.hqz.yjg.second.observerable;

import static cn.sx.xa.bqq.hqz.yjg.second.observerable.Area.BEIJING;
import static cn.sx.xa.bqq.hqz.yjg.second.observerable.Area.XIAN;

import java.util.Observable;

import cn.sx.xa.bqq.hqz.yjg.second.BeiJingBiscuitStore;
import cn.sx.xa.bqq.hqz.yjg.second.BiscuitStore;
import cn.sx.xa.bqq.hqz.yjg.second.XiAnBiscuitStore;
//被观察者
public class Customer extends Observable{

	private String name;
	
	
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	public void systemCutomerWant(String area,String type){
		System.out.println(name+"想吃个"+type+"的饼干");
		super.setChanged();
		super.notifyObservers(type);
	}
	// 为被观察者对象 添加一个观察的对象
	public void orderBiscuit(String area,String type) {
		if(area.equals(BEIJING)){
			BiscuitStore beijing = new BeiJingBiscuitStore(this);
			this.systemCutomerWant(area, type);
		}
		if(area.equals(XIAN)){
			BiscuitStore xian = new XiAnBiscuitStore(this);
			this.systemCutomerWant(area, type);	
		}
	}
	
}
