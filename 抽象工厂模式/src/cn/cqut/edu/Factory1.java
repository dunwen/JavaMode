package cn.cqut.edu;

public class Factory1 extends Factory{

	@Override
	public void creatA() {
		new ProductA1().method();
	}

	@Override
	public void creatB() {
		new ProductB1().method();
	}

}
