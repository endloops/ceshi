package cn.sx.xa.bqq.hqz.yjg.start;

public class TestDemo {
	
	public static void main(String[] args) throws Exception {
		SimpleJuiceFactory factory = new SimpleJuiceFactory();
		JuiceStore juiceStore = new JuiceStore(factory);
		juiceStore.orderJuice("Apple");
	}
		
}
