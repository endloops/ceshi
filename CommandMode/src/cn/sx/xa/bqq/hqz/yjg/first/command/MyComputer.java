package cn.sx.xa.bqq.hqz.yjg.first.command;

public class MyComputer extends Computer{
	
	private volatile static MyComputer wangzhezhao;
	
	private MyComputer(String color,String name){
		super.setColor(color);
		super.setName(name);
	}
	
	public static MyComputer getInstance(String color,String name){
		
		if(wangzhezhao == null){
			synchronized(MyComputer.class){
				wangzhezhao = new MyComputer(color, name);
			}
		}
		return wangzhezhao;
		
	}
}
