package cn.sx.xa.bqq.hqz.yjg.first.command;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

//单击事件
public class ClickEvent implements Observer{
	
	private ComputerCommand cp[];

	private void executewhich(int i) {
		cp[i].execute();
	}

	@Override
	public void update(Observable o, Object arg) {
		int i = (int) arg;
		executewhich(i);
	}

	public ComputerCommand getCp(int sort) {
		return cp[sort];
	}

	public void setCp(ComputerCommand son , int sort) {
		this.cp[sort] = son;
	}

	public ClickEvent(ComputerCommand[] cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "ClickEvent [cp=" + Arrays.toString(cp) + "]";
	}
	
	
	
}
