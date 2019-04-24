package cn.sx.xa.bqq.hqz.yjg.start;

import java.math.BigDecimal;

public abstract class Beverage {
	
	String description = "unknow Beverage";
	
	String size = null;
	
	private static String TALL = "tall";
	private static String GRANDE = "grande";
	private static String VENTI = "venti";
	
	public String getDescription(){
		return size + description;
	}
	
	public abstract BigDecimal coust() throws Exception;
	
	public void setSize(String size){
		this.size = size;
	}
	public BigDecimal getSize() throws Exception{
		if(size.equals(Beverage.TALL)){
			return new BigDecimal("0.10");
		}else if(size.equals(Beverage.GRANDE)){
			return new BigDecimal("0.15");
		}else if(size.equals(Beverage.VENTI)){
			return new BigDecimal("0.20");
		}else{
			throw new Exception("we dont have this select");
		}
		
	}
}
