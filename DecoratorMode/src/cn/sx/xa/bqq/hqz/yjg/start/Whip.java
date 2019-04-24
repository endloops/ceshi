package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

public class Whip extends Condiment{

	Beverage beverage;
	
	
	
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Whip";
	}

	@Override
	public BigDecimal coust() throws Exception {
		// TODO Auto-generated method stub
		return beverage.coust().add(new BigDecimal("0.40"));
	}

}
