package cn.sx.xa.bqq.hqz.yjg.first;

public class StartState implements State {
	
	BarBecue barbecue;

	
	public StartState(BarBecue barbecue) {
		this.barbecue = barbecue;
	}

	@Override
	public void pushButton() {
		
	}

	@Override
	public void getfold() {
		
	}

	@Override
	public void plugPower() {
		System.out.println("you do the true step");
	}

	@Override
	public void downPower() {
		// TODO Auto-generated method stub
		
	}

}
