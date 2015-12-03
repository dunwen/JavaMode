package cn.cqut.edu;

public class Test {
	
	
	public static void main(String[] args) {
		
		Bean b = Bean.getBeanInstance();
		System.out.println("这是第一次创建的bean的地址>>>"+b.toString());
		
		Bean b1 = Bean.getBeanInstance();
		System.out.println("这是第二次创建的bean的地址>>>"+b1.toString());
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				Bean b = Bean.getBeanInstance();
				System.out.println("这是在其它线程里面创建的bean>>>"+b.toString());
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
	}
}
