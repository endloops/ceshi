package cn.sx.xa.bqq.hqz.yjg.first;

//烧烤店
public class BarBecue {
	State fouth;
	State start;
	State second;
	State third;

	State nowstate = fouth;
	int count = 0;

	public BarBecue(int state) {
		fouth = new FouthState(this);
		third = new ThirdState(this);
		second = new SecondState(this);
		start = new StartState(this);
		this.count = state;
		if (state > 0) {
			nowstate = start;
		}
	}

	public void start() {
		nowstate.plugPower();
	}

	public void second() {
		nowstate.pushButton();
	}

	public void third() {
		nowstate.downPower();
	}

	public void fouth() {
		nowstate.getfold();
	}


	public State getFouth() {
		return fouth;
	}

	public void setFouth(State fouth) {
		this.fouth = fouth;
	}

	public State getStart() {
		return start;
	}

	public void setStart(State start) {
		this.start = start;
	}

	public State getSecond() {
		return second;
	}

	public void setSecond(State second) {
		this.second = second;
	}

	public State getThird() {
		return third;
	}

	public void setThird(State third) {
		this.third = third;
	}
}
