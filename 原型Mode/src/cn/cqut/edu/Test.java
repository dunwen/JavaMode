package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
//		ǳ���Ʋ���
//		User u = new User();
//		u.setPwd("aaa");
//		u.setUserName("bbb");
//		u.getList().add("ccc");
//		
//		System.out.println(u.toString());
//		
//		User u1 = null;
//		try {
//			u1 = u.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(u1.toString());
//		
//		u1.getList().add("dddddd");
//		
//		System.out.println("ԭ����>>>"+u.toString());
//		System.out.println("��¡��>>>"+u1.toString());
		
		User u = new User();
		Session s = Session.getSession();
		
		u.setUserName("userName");
		u.setPwd("pwd");
		u.getList().add("list0");
		s.setU(u);

		System.out.println("�´��¶���>>>"+u.toString());
		
		User cloneUser = s.getU();
		System.out.println("��õĿ�¡����>>>"+cloneUser.toString());
		
		cloneUser.setPwd("aaaa");
		cloneUser.setUserName("bbb");
		cloneUser.getList().add("ccc");
		
		System.out.println("�޸ĺ�Ŀ�¡����>>>"+cloneUser.toString());
		
		
		User realUser = s.getRealU();
		System.out.println("�޸ĺ����ʵ����>>>"+realUser.toString());
		
		
		
	}
}
