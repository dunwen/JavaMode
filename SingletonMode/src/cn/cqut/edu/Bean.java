package cn.cqut.edu;

public class Bean {
	/*
	 * ���ع��췽��
	 * */
	private Bean(){}
	
	private static Bean b = null;
	
	public static Bean getBeanInstance(){
		//Ԥ������Ҫͬ��
		if(b==null){
			synchronized (Bean.class) {
				/*
				 *�ٴ��п�����Ϊ��ֹ���̷߳��ʳ���ԭ����java��������ִ�У�����ֹ
				 *A�̷߳����ڴ��û�е��ù��캯��ʱ��B�߳�ȡ�� 
				 * */
				if(b==null){
					b = new Bean(); 
				}
			}
		}
		return b;
	
	}
	
	
	
	

}
