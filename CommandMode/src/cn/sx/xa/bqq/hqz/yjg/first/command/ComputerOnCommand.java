package cn.sx.xa.bqq.hqz.yjg.first.command;

public class ComputerOnCommand implements ComputerCommand {

	Computer computer;

	public ComputerOnCommand(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void execute() {
		computer.openComputer();
	}

}
