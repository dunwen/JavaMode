package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
		Bean b = new Bean();
		b.invokeMethod();
		b.setM(new Method() {
			
			@Override
			public void method() {
				System.out.println("我是自定义的策略");
			}
		});
		
		b.invokeMethod();
		
	}
}
