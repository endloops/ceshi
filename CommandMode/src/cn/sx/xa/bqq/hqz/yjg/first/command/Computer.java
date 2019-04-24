package cn.sx.xa.bqq.hqz.yjg.first.command;

public class Computer implements ComputerBehavior{
	
	private String name ;
	
	private String color ;

	@Override
	public void openComputer() {
		System.out.println(this.name + this.color + "开机了");
	}

	@Override
	public void offComputer() {
		System.out.println(this.name + this.color + "关机了");
	}

	@Override
	public void restartComputer() {
		System.out.println(this.name + this.color + "重启了");
	}

	@Override
	public void sleepComputer() {
		System.out.println(this.name + this.color + "睡眠了");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
