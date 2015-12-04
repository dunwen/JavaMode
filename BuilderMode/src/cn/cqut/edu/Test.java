package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
		Bean b = new Bean.Builder().setAddress("广东省佛山市")
				.setId(1)
				.setMode("我这个模式很厉害")
				.setName("hzm")
				.create();
		System.out.println(b.toString());
	}
}
