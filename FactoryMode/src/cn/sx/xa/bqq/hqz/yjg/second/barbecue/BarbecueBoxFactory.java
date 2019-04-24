package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

import cn.sx.xa.bqq.hqz.yjg.second.material.fire.Fire;

public class BarbecueBoxFactory {
	
	private static BarbecueBoxFactory boxFactory = new BarbecueBoxFactory();

	public static BarbecueBoxFactory getInstance(){
		return boxFactory;
	}
	
	private BarbecueBoxFactory(){}
	
	public BarbecueBox generateBarbecueBox(){
		MaterialOperating materialOperating = new MaterialOperating(new Fire());
		Barbecue  start = new BarbecueStart(materialOperating);
		Barbecue  second = new BarbecueSecond(materialOperating);
		Barbecue[] barbecues = new Barbecue[]{start,second};
		BarbecueBox barbecueBox = BarbecueBox.getInstance(barbecues);
		return barbecueBox;
	}
}
