package cn.cqut.edu;

public class Bean{

	/*
	 *Ĭ�ϵĲ��ԣ������½��ֱ࣬��new ��һ������
	 * */
	Method m = new Method() {
		
		@Override
		public void method() {
			System.out.println("����Ĭ�ϲ���");
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
