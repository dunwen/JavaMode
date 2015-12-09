package cn.cqut.edu;


/*
 * 就像平时我们关电脑一样。
 * 我们只需要点了关机键，而计算机需要去做什么我们并不需要去关心，这样可以隐藏关机这个命令的细节
 * */
public class Test {
	public static void main(String[] args) {
		ComputerCommand c = new ComputerCommand(new Recever());
		c.execute();
	}
}
