package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

public class BarBecueBoxStore {

	private BarbecueBox[] barbecueBoxs;

	private static BarbecueStaff barbecueStaff;

	// 店员去买 烧烤箱
	public BarbecueBox getWhich(int i) {
		if (barbecueBoxs == null) {
			barbecueBoxs = barbecueStaff.setBarbecueBox(10);
		}
		if (i > barbecueBoxs.length) {
			return null;
		} else {
			return barbecueBoxs[i];
		}
	}

	public BarbecueStaff getBarbecueStaff() {
		return barbecueStaff;
	}
	static {
		// 烧烤箱工厂
		BarbecueBoxFactory barbecueBoxFactory = BarbecueBoxFactory.getInstance();
		// 烧烤箱店员
		BarbecueStaff barbecueStaff = new BarbecueStaff();
		barbecueStaff.setBarbecueBoxFactory(barbecueBoxFactory);
		// 烧烤箱店 放入店员
		BarBecueBoxStore.barbecueStaff = barbecueStaff;
	}

}
