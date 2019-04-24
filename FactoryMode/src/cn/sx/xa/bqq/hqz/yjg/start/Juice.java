package cn.sx.xa.bqq.hqz.yjg.start;

public class Juice {
	
	private Fruit fruit;
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	void first(){
		System.out.println(fruit.name+"采摘");
	}
	void second(){
		System.out.println(fruit.name+"清洗");
	}
	void third(){
		System.out.println(fruit.name+"取果肉");
	}
	void fouth(){
		System.out.println(fruit.name+"加水");
	}
	void fifth(){
		System.out.println(fruit.name+"汁装杯");
	}
	public Juice(Fruit fruit) {
		super();
		this.fruit = fruit;
	}
	
}
