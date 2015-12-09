package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.setmMethod(new LoginState());
		m.getData();
		
		m.setmMethod(new LogoutState());
		m.getData();
		
	}
}
