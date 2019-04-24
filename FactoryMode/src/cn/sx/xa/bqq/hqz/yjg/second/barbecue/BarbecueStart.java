package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

import cn.sx.xa.bqq.hqz.yjg.second.material.Material;

//命令模式1
public class BarbecueStart extends Barbecue{

	public BarbecueStart(MaterialOperating materialOperating) {
		super(materialOperating);
	}

	@Override
	public void execute(Material material) {
		super.useFire();
		System.out.println(material.getRawMaterial()+"被火烤成软的了");
	}
}
