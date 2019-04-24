package cn.sx.xa.bqq.hqz.yjg.template;

public class Test {
	public static void main(String[] args) {
		DuckStore duckStore = new BlueDuckStore(new BlueDuck());
		duckStore.duckCando();
		
		DuckStore duckStore1 = new RedDuckStore(new RedDuck());
		duckStore1.duckCando();
	}
}
