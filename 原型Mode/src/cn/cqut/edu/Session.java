package cn.cqut.edu;

/**
 * ����ֻ�ܳ�ʼ����ʱ������Userʵ����������User�����ò����޸�Userʵ���Ĳ�����
 * */
public class Session {
	private User u;
	private static Session mSession= null;

	private Session(){}

	public static Session getSession(){
		if(mSession==null){
			mSession = new Session();
		}
		return mSession;
	}
	
	public void setU(User u) {
		this.u = u;
	}
	
	/**
	 * �����÷��������Ƿ��user�Ŀ�¡�����޸Ļ᲻���session�е�user�޸�
	 * */
	public User getRealU(){
		return u;
	}
	
	
	/**
	 * ���ص�Ӧ����user�Ŀ�¡������u��ָ�룬
	 * ��������user��ָ�룬�����ͨ��user�ķ����Բ��ɸı��Session���е�User���޸�
	 * */
	public User getU() {
		User newUser = null;
		try {
			newUser = u.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return newUser;
		
	}
		

}
