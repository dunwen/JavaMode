package cn.cqut.edu;

public class Test {
	
	
	public static void main(String[] args) {
		
		Bean b = Bean.getBeanInstance();
		System.out.println("���ǵ�һ�δ�����bean�ĵ�ַ>>>"+b.toString());
		
		Bean b1 = Bean.getBeanInstance();
		System.out.println("���ǵڶ��δ�����bean�ĵ�ַ>>>"+b1.toString());
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				Bean b = Bean.getBeanInstance();
				System.out.println("�����������߳����洴����bean>>>"+b.toString());
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
	}
}
