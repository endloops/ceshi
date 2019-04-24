package cn.sx.xa.bqq.hqz.yjg.first.command;

import java.util.Observable;

public class Mouse extends Observable{
	
	public void start(int command){
		super.setChanged();
		super.notifyObservers(command);
	}
}
