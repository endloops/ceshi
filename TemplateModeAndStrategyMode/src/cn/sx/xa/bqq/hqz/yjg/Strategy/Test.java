package cn.sx.xa.bqq.hqz.yjg.Strategy;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import cn.sx.xa.bqq.hqz.yjg.template.BlueDuck;

public class Test {
	public static void main(String[] args) {
		DuckStore duckStore = new DuckStore(new BlueDuck());
		duckStore.duckCando();
		DuckStore duckStore1 = new DuckStore(new BlueDuck());
		duckStore1.duckCando();
		
	}
}
