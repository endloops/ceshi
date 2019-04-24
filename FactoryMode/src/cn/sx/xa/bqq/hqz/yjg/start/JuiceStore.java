package cn.sx.xa.bqq.hqz.yjg.start;
public class JuiceStore {
	
	SimpleJuiceFactory factory;
	
	
	public JuiceStore(SimpleJuiceFactory factory) {
		this.factory = factory;
	}


	Juice orderJuice(String fruitName) throws Exception{
		Juice juice = factory.createJuice(fruitName);
		juice.first();
		juice.second();
		juice.third();
		juice.fouth();
		juice.fifth();
		return juice;
	}
}
