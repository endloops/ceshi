package cn.sx.xa.bqq.hqz.yjg.second.material;

public class BigFlourMaterial extends BasicMaterial {

	public BigFlourMaterial(Material material) {
		super(material);
		
	}

	private static String METERRIAL = "大麦";
	
	@Override
	public String getRawMaterial() {
		// TODO Auto-generated method stub
		return super.getRawMaterial()+METERRIAL;
	}

	public static void setMETERRIAL(String mETERRIAL) {
		METERRIAL = mETERRIAL;
	}
	
	
}
