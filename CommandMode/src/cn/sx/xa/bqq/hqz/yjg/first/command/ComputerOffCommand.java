package cn.sx.xa.bqq.hqz.yjg.first.command;

public class ComputerOffCommand implements ComputerCommand {

	Computer computer;

	public ComputerOffCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.offComputer();
	}
}
