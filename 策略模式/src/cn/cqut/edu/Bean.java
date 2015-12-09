package cn.cqut.edu;

public class Bean{

	/*
	 *默认的策略，懒得新建类，直接new 出一个对象
	 * */
	Method m = new Method() {
		
		@Override
		public void method() {
			System.out.println("我是默认策略");
		}
	};
	
	
	
	public Method getM() {
		return m;
	}

	public void setM(Method m) {
		this.m = m;
	}



	public void invokeMethod() {
		if(m!=null){
			m.method();
		}
	}
	
}
