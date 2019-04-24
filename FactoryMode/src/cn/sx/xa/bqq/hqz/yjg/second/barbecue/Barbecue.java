package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

import cn.sx.xa.bqq.hqz.yjg.second.material.Material;
import cn.sx.xa.bqq.hqz.yjg.second.material.fire.Tool;

//装饰者源
public  class Barbecue extends MaterialOperating implements Command{
	
	private MaterialOperating materialOperating;
	
	public Barbecue(MaterialOperating materialOperating) {
		super(materialOperating.getTool());
		this.materialOperating = materialOperating;
	}
	@Override
	public void execute(Material material) {
		materialOperating.useFire();
	}
	
}
