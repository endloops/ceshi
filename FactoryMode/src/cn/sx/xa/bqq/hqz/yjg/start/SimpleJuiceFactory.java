package cn.sx.xa.bqq.hqz.yjg.start;

import cn.sx.xa.bqq.hqz.yjg.start.juice.AppleJuice;

public class SimpleJuiceFactory {
	public Juice createJuice(String name) throws Exception{
		if(name.equals("Apple")){
			return new AppleJuice(new Fruit(name));
		}else{
			throw new Exception("we do not have this fruit juice");
		}
	}
}
