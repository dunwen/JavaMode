package cn.cqut.edu.bean;

import cn.cqut.edu.impl.Product;

public class Factory {
	
	public <T extends Product>T create (Class<T> clazz){
		Product p = null;
		
		try {
			p = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return (T)p;
	}
	
}
