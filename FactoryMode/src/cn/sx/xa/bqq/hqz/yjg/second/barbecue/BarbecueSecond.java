package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

import cn.sx.xa.bqq.hqz.yjg.second.material.Material;

//命令模式2
public class BarbecueSecond extends Barbecue{
	
	

	public BarbecueSecond(MaterialOperating materialOperating) {
		super(materialOperating);
	}
	@Override
	public void execute(Material material) {
		// TODO Auto-generated method stub
		super.useFire();
		System.out.println(material.getRawMaterial()+"被火烤成脆的了");

	}

}
