package cn.cqut.edu;

public class ComputerCommand implements Command{
	private Recever r;
	
	public ComputerCommand(Recever r) {
		this.r = r;
	}
	
	@Override
	public void execute() {
		r.saveFile();
		r.closeFile();
		r.shutdown();
	}


	public void setR(Recever r) {
		this.r = r;
	}
	
	
	
}
