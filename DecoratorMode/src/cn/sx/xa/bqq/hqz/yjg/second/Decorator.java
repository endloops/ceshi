package cn.sx.xa.bqq.hqz.yjg.second;

public abstract class Decorator implements Human {
	
	private Human human;

	public Decorator(Human human) {
		this.human = human;
	}

	public void wearClothes() {
		human.wearClothes();
	}

	public void walkToWhere() {
		human.walkToWhere();
	}
}
