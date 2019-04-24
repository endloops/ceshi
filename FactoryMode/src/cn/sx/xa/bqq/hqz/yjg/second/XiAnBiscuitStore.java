package cn.sx.xa.bqq.hqz.yjg.second;

import java.util.Observable;

import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.XiAnBiscuit;
import cn.sx.xa.bqq.hqz.yjg.second.material.BeiJingBiscuitFactory;
import cn.sx.xa.bqq.hqz.yjg.second.material.BigFlourMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.BlackCornMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.RedCornMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.SmallFlourMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.XianBiscuitFactory;
//工厂2   观察者对象
public class XiAnBiscuitStore extends BiscuitStore {
	
	public XiAnBiscuitStore(Observable obserable) {
		super(obserable);
		// TODO Auto-generated constructor stub
	}

	@Override
	Biscuit createBiscuit(String type) {
		XiAnBiscuit biscuit = XianBiscuitFactory.getInstance(type).creatXianBiscuit(type);
		return biscuit;
	}
	//当被观察者 触发动作的时候，观察者作出的响应。
	@Override
	public void update(Observable o, Object arg) {
		
		orderBiscuit(arg.toString());	
	}

	public XiAnBiscuitStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
