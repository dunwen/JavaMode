package cn.cqut.edu;

public class LogoutState implements Method{

	@Override
	public void Login() {
		System.out.println("登录成功");
	}

	@Override
	public void LogOut() {
		
	}

	@Override
	public void getData() {
		System.out.println("跳到登录界面");
	}

}
