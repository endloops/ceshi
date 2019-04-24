package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

public class Soy extends Condiment{

	Beverage beverage;
	
	
	
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Soy";
	}

	@Override
	public BigDecimal coust() throws Exception {
		// TODO Auto-generated method stub
		return beverage.coust().add(new BigDecimal("0.30"));
	}

}
