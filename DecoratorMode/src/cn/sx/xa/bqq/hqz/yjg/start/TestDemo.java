package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

/**
 *  计算double类型的加法是
 * @author wang
 *
 */
public class TestDemo {
	public static void main(String[] args) throws Exception {
		Beverage beverage = new Espresso("grande");
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		System.out.println(beverage.getDescription() + "$" +beverage.coust().doubleValue());
		System.out.println(new BigDecimal("0.52").add(new BigDecimal("0.30")));
	}
}
