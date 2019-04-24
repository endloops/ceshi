package cn.sx.xa.bqq.hqz.yjg.second.material;

public class SmallFlourMaterial  extends BasicMaterial {

	public SmallFlourMaterial(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}

	private static String MATERIAL = "小麦";

	@Override
	public String getRawMaterial() {
		// TODO Auto-generated method stub
		return super.getRawMaterial()+MATERIAL;
	}

}
