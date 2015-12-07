package cn.cqut.edu.bean;

import cn.cqut.edu.impl.Product;

public class Test {
	public static void main(String[] args) {
		Factory mFactroy = new Factory();
//		Product p = mFactroy.create(ProductA .class);
		Product p = mFactroy.create(ProductB .class);
		p.method();
	}
}
