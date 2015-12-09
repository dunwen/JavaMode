package cn.cqut.edu;

public class LinkLess10 extends Link{

	@Override
	public void exec(int msg) {
		if(msg<10){
			System.out.println("LinkLess10 处理了这个请求");
		}else{
			next.exec(msg);
		}
	}

}
