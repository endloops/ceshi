package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

public class Espresso extends Beverage{

	
	
	public Espresso(String size) {
		description = "Espresso";
		this.size = size;
	}

	@Override
	public BigDecimal coust() throws Exception {
		// TODO Auto-generated method stub
		return getSize().add(new BigDecimal("0.22"));
	}

}
