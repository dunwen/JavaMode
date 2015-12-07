package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
//		浅复制测试
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
//		System.out.println("原来的>>>"+u.toString());
//		System.out.println("克隆的>>>"+u1.toString());
		
		User u = new User();
		Session s = Session.getSession();
		
		u.setUserName("userName");
		u.setPwd("pwd");
		u.getList().add("list0");
		s.setU(u);

		System.out.println("新创新对象>>>"+u.toString());
		
		User cloneUser = s.getU();
		System.out.println("获得的克隆对象>>>"+cloneUser.toString());
		
		cloneUser.setPwd("aaaa");
		cloneUser.setUserName("bbb");
		cloneUser.getList().add("ccc");
		
		System.out.println("修改后的克隆对象>>>"+cloneUser.toString());
		
		
		User realUser = s.getRealU();
		System.out.println("修改后的真实对象>>>"+realUser.toString());
		
		
		
	}
}
