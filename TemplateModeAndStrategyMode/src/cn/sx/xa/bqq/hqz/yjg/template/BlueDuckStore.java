package cn.sx.xa.bqq.hqz.yjg.template;

//绿色鸭子店
public class BlueDuckStore extends DuckStore{

	private Duck duckl;
	
	
	@Override
	public void ducksong() {
		duckl.song();
	}

	@Override
	public void duckeat() {
		duckl.eat();
	}

	public BlueDuckStore(Duck duckl) {
		this.duckl = duckl;
	}

	
}
