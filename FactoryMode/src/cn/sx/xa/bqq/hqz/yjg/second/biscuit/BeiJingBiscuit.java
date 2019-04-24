package cn.sx.xa.bqq.hqz.yjg.second.biscuit;

import cn.sx.xa.bqq.hqz.yjg.second.material.Material;

public class BeiJingBiscuit extends Biscuit{
	
	private String area;
	
	public BeiJingBiscuit(Material material,String area) {
		super(material);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
