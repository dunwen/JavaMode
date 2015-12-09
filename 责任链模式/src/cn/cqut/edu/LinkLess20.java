package cn.cqut.edu;

public class LinkLess20 extends Link{

	@Override
	public void exec(int msg) {
		if(msg<20){
			System.out.println("LinkLess20 ´¦ÀíÁË");
		}else{
			next.exec(msg);
		}
	}

}
