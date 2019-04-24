package cn.sx.xa.bqq.hqz.yjg.first;

//对象适配器
public class TurkeyAdapter implements Duck{

	Turke turke;
	
	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turke.fly();
		}
	}

	@Override
	public void quark() {
		turke.gobble();
	}

	public TurkeyAdapter(Turke turke) {
		super();
		this.turke = turke;
	}
	

	
}
