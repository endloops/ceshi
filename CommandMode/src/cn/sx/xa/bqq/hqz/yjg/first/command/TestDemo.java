package cn.sx.xa.bqq.hqz.yjg.first.command;

public class TestDemo {
	public static void main(String[] args) {
		// 单例
		Computer computer = MyComputer.getInstance("red", "thinkpad");

		Computer computers = MyComputer.getInstance("black", "thinkpad");

		// 命令具象
		ComputerCommand command1 = new ComputerOnCommand(computers);
		// 命令具象
		ComputerCommand command2 = new ComputerOffCommand(computers);
		// 命令具象
		ComputerCommand command3 = new ComputerSleepCommand(computers);
		// 命令具象
		ComputerCommand command4 = new ComputerRestartCommand(computers);

		// 可观察者
		Mouse mouse = new Mouse();

		// 命令 + 观察者
		ComputerCommand[] commands = new ComputerCommand[10];
		ClickEvent clickEvent = new ClickEvent(commands);
		clickEvent.setCp(command1, 0);
		clickEvent.setCp(command2, 1);
		clickEvent.setCp(command3, 2);
		clickEvent.setCp(command4, 3);
		System.out.println(clickEvent);
		mouse.addObserver(clickEvent);
		mouse.start(0);
		mouse.start(1);
		mouse.start(2);
		mouse.start(3);

	}
}
