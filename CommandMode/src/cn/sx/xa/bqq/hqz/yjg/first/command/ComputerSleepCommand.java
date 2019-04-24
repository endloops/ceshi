package cn.sx.xa.bqq.hqz.yjg.first.command;

public class ComputerSleepCommand implements ComputerCommand {

	Computer computer;

	public ComputerSleepCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.sleepComputer();
	}

}
