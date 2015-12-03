package cn.cqut.edu;

public class Bean {
	/*
	 * 隐藏构造方法
	 * */
	private Bean(){}
	
	private static Bean b = null;
	
	public static Bean getBeanInstance(){
		//预防不必要同步
		if(b==null){
			synchronized (Bean.class) {
				/*
				 *再次判空是因为防止多线程访问出错（原因是java允许乱序执行），防止
				 *A线程分配内存后并没有调用构造函数时被B线程取走 
				 * */
				if(b==null){
					b = new Bean(); 
				}
			}
		}
		return b;
	
	}
	
	
	
	

}
