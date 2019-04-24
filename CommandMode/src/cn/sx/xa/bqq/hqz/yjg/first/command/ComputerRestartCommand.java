package cn.sx.xa.bqq.hqz.yjg.first.command;

public class ComputerRestartCommand implements ComputerCommand {

	Computer computer;

	public ComputerRestartCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.restartComputer();
	}

}
