package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
		Bean b = new Bean.Builder().setAddress("�㶫ʡ��ɽ��")
				.setId(1)
				.setMode("�����ģʽ������")
				.setName("hzm")
				.create();
		System.out.println(b.toString());
	}
}
