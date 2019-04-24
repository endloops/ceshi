package cn.sx.xa.bqq.hqz.yjg.second.material;

//装饰源
public class BasicMaterial implements Material{
	
	private Material material;
	
	private static String METERRIAL = "原料 是：";
	
	@Override
	public String getRawMaterial() {
		// TODO Auto-generated method stub
		if(material == null){
			return METERRIAL;
		}else{
			return material.getRawMaterial();
		}
	}

	public BasicMaterial(Material material) {
		this.material = material;
	}
	public BasicMaterial() {
	}
}
