package cn.sx.xa.bqq.hqz.yjg.second.barbecue;

public class BarbecueStaff {
	
	private BarbecueBoxFactory barbecueBoxFactory;	
	
	public BarbecueBoxFactory getBarbecueBoxFactory() {
		return barbecueBoxFactory;
	}




	public void setBarbecueBoxFactory(BarbecueBoxFactory barbecueBoxFactory) {
		this.barbecueBoxFactory = barbecueBoxFactory;
	}




	public BarbecueBox[] setBarbecueBox(int number){
		
		BarbecueBox[] barbecueBoxs = new BarbecueBox[number];
		for(int i = 0;i<number ;i++){
			barbecueBoxs[i] = barbecueBoxFactory.generateBarbecueBox();
		}
		return barbecueBoxs;		
	}
}
