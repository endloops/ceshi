package cn.sx.xa.bqq.hqz.yjg.first;

public class TestDemo {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.fly();
		duck.quark();
		Turke turke = new WildTurke();
		turke.fly();
		turke.gobble();
		
		Duck adapter = new TurkeyAdapter(turke);
		
		adapter.fly();
		adapter.quark();
	}
}
