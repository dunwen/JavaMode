package cn.cqut.edu;

import java.util.Observable;

public class Factoty extends Observable{

	public void postNews(String news){
		setChanged();//标示发生变化
		notifyObservers(news);//通知订阅者发生变化
	}
	
}
