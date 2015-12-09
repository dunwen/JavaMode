package cn.cqut.edu;

/**
 * π‹¿Ì¿‡
 * */
public class Manager {
	private Method mMethod;
	public Manager() {}
	
	public Method getmMethod() {
		return mMethod;
	}
	public void setmMethod(Method mMethod) {
		this.mMethod = mMethod;
	}
	
	public void Login(){
		mMethod.Login();
	}
	public void LogOut(){
		mMethod.LogOut();
	}
	public void getData(){
		mMethod.getData();
	}
	
}
