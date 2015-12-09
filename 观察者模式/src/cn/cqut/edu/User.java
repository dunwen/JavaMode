package cn.cqut.edu;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
	private String name = "";
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Œ“ «"+name+":"+arg);
	}

}
