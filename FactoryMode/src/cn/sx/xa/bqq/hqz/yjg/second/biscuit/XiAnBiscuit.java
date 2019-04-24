package cn.sx.xa.bqq.hqz.yjg.second.biscuit;

import cn.sx.xa.bqq.hqz.yjg.second.material.Material;

public class XiAnBiscuit extends Biscuit{
	
	private String area;
	
	public XiAnBiscuit(Material material,String area) {
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
