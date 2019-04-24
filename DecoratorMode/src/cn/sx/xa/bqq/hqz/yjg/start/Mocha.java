package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

public class Mocha extends Condiment{

	Beverage beverage;
	
	
	
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Mocka";
	}

	@Override
	public BigDecimal coust() throws Exception {
		// TODO Auto-generated method stub
		return beverage.coust().add(new BigDecimal("0.20"));
	}

}
