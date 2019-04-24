package cn.sx.xa.bqq.hqz.yjg.Strategy;

import cn.sx.xa.bqq.hqz.yjg.template.Duck;

//鸭子店策略
public class DuckStore {
	
	private Duck duck;
	
	public void duckCando(){
		ducksong();
		duckeat();
	}
	
	public  void ducksong() {
		duck.song();
	}
	
	public  void duckeat() {
		duck.eat();
	}

	public DuckStore(Duck duck) {
		super();
		this.duck = duck;
	}

	
}
