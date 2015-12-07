package cn.cqut.edu;

import java.util.ArrayList;
import java.util.List;


public class User implements Cloneable{
	private String userName = "";
	private String pwd ="";
	private ArrayList<String> list = new ArrayList<>();
	
	public User() {}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + ", list=" + list
				+ "]";
	}

	@Override
	protected User clone() throws CloneNotSupportedException {
		User u = (User)super.clone();
		u.list = (ArrayList<String>) this.list.clone();
		//对象里面的对象也应该要调用一次clone ，否则克隆的只是浅复制
		return u;
	}
	
}
