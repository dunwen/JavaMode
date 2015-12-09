package cn.cqut.edu;

public interface Method {
	
	void Login();//只有没有登录才可以登录
	void LogOut();//只有登录了才可以注销
	void getData();//如果登录了获取数据，没有登录则提示登录
}
