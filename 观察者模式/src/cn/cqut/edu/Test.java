package cn.cqut.edu;

/*
 * Observer��java����
 * */
public class Test {
	public static void main(String[] args) {
		User u1 = new User("hzm");
		User u2 = new User("hzm1");
		User u3 = new User("hzm2");
		
		Factoty f = new Factoty();
		f.addObserver(u1);
		f.addObserver(u2);
		f.addObserver(u3);
		
		f.postNews("��ĳ�������BUG��");//������Ա���ʹ���Ļ���
		
	}
}
