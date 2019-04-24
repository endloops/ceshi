package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

import cn.sx.xa.bqq.hqz.yjg.second.material.Material;

//一个烧烤箱
public class BarbecueBox {
	
	private volatile static BarbecueBox barbecueBox;
	
	private Barbecue[] barbecue;

	private Material material;
	
	
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Barbecue[] getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(Barbecue[] barbecue) {
		this.barbecue = barbecue;
	}

	private BarbecueBox() {
		super();
	}
	
	public static BarbecueBox getInstance(Barbecue[] barbecue){
		
		if(barbecueBox==null){
			synchronized (BarbecueBox.class) {
				barbecueBox = new BarbecueBox();
				barbecueBox.setBarbecue(barbecue);
			}
		}
		return barbecueBox;
		
	}
	
	public void Doexecute(int i){
		if(this.material == null){
			System.out.println("请放入食物");
		}else if(i<barbecue.length){
			barbecue[i].execute(this.material);
		}else{
			System.out.println("别乱按呀");
		}
	}
	
	
}
