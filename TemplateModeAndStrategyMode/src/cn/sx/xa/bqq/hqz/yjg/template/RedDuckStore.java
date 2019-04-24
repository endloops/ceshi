package cn.sx.xa.bqq.hqz.yjg.template;

public class RedDuckStore extends DuckStore{

	private Duck duckl;
	
	@Override
	public void ducksong() {
		duckl.song();
	}

	@Override
	public void duckeat() {
		duckl.eat();
	}

	public RedDuckStore(Duck duckl) {
		this.duckl = duckl;
	}

	
}