package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

public class HouseBlend extends Beverage{

	
	
	
	public HouseBlend(String size) {
		description = "House Blend Coffee";
		this.size = size;
	}

	@Override
	public BigDecimal coust() throws Exception {
		// TODO Auto-generated method stub
		return getSize().add(new BigDecimal("0.89"));
	}

}
