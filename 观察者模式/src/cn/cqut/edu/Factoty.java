package cn.cqut.edu;

import java.util.Observable;

public class Factoty extends Observable{

	public void postNews(String news){
		setChanged();//��ʾ�����仯
		notifyObservers(news);//֪ͨ�����߷����仯
	}
	
}
