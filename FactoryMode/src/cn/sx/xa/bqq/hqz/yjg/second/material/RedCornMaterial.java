package cn.sx.xa.bqq.hqz.yjg.second.material;

public class RedCornMaterial  extends BasicMaterial {
	
	public RedCornMaterial(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	private static String MATERIAL = "红豆";
	@Override
	public String getRawMaterial() {
		// TODO Auto-generated method stub
		return super.getRawMaterial()+MATERIAL;
	}
	public static String getMATERIAL() {
		return MATERIAL;
	}
}
