package cn.sx.xa.bqq.hqz.yjg.second.material;

public class BlackCornMaterial  extends BasicMaterial {

	public BlackCornMaterial(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}

	private static String MATERIAL = "黑豆";
	@Override
	public String getRawMaterial() {
		// TODO Auto-generated method stub
		return super.getRawMaterial()+MATERIAL;
	}

}
