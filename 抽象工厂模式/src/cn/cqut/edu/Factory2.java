package cn.cqut.edu;

public class Factory2 extends Factory{

	@Override
	public void creatA() {
		new ProductA2().method();
	}

	@Override
	public void creatB() {
		new ProductB2().toString();
	}

}
