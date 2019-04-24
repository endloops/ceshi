package cn.sx.xa.bqq.hqz.yjg.second;

import java.util.Observable;

import cn.sx.xa.bqq.hqz.yjg.second.biscuit.BeiJingBiscuit;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.XiAnBiscuit;
import cn.sx.xa.bqq.hqz.yjg.second.material.BeiJingBiscuitFactory;
import cn.sx.xa.bqq.hqz.yjg.second.material.BigFlourMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.BlackCornMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.RedCornMaterial;
import cn.sx.xa.bqq.hqz.yjg.second.material.SmallFlourMaterial;
//工厂1
public class BeiJingBiscuitStore extends BiscuitStore {

	public BeiJingBiscuitStore(Observable obserable) {
		super(obserable);
		// TODO Auto-generated constructor stub
	}

	@Override
	Biscuit createBiscuit(String type) {
		BeiJingBiscuitFactory beiJingBiscuitFactory = BeiJingBiscuitFactory.getInsterance(type);
		Biscuit biscuit = beiJingBiscuitFactory.creatBiscuit(type);
		return biscuit;
	}

	@Override
	public void update(Observable o, Object arg) {
		orderBiscuit(arg.toString());	
	}

	public BeiJingBiscuitStore() {
		super();
	}
	
	
}
