package cn.sx.xa.bqq.hqz.yjg.second;

import java.util.Observable;
import java.util.Observer;

import cn.sx.xa.bqq.hqz.yjg.second.barbecue.BarBecueBoxStore;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.Barbecue;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.BarbecueBox;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.BarbecueBoxFactory;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.BarbecueSecond;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.BarbecueStaff;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.BarbecueStart;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.Command;
import cn.sx.xa.bqq.hqz.yjg.second.barbecue.MaterialOperating;
import cn.sx.xa.bqq.hqz.yjg.second.biscuit.Biscuit;
import cn.sx.xa.bqq.hqz.yjg.second.material.fire.Fire;
import cn.sx.xa.bqq.hqz.yjg.second.material.fire.Tool;
//工厂模型
public abstract class BiscuitStore implements Observer{

	private BiscuitStaff staff;
	
	private BarbecueBox barbecueBox;
	//饼干生成
	public Biscuit orderBiscuit(String type) {
		//原材料
		Biscuit biscuit = createBiscuit(type);
		System.out.println("地点："+biscuit.getArea());
		BarBecueBoxStore barBecueBoxStore = new BarBecueBoxStore();			
		//饼干店 获得一个 烧烤箱
		BarbecueBox box = barBecueBoxStore.getWhich(0);
		//饼干店放入材料
		box.setMaterial(biscuit.getMaterial());
		//饼干店点击1 烧烤箱按钮
		box.Doexecute(0);
		//饼干店点击2 烧烤箱按钮
		box.Doexecute(1);
		
		return biscuit;
	}
	


	abstract Biscuit createBiscuit(String type);


	public BiscuitStore(Observable obserable) {
		obserable.addObserver(this);
	}


	public BiscuitStore() {
		
	}
	
	
}
