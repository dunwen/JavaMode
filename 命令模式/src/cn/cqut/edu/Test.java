package cn.cqut.edu;


/*
 * ����ƽʱ���ǹص���һ����
 * ����ֻ��Ҫ���˹ػ��������������Ҫȥ��ʲô���ǲ�����Ҫȥ���ģ������������عػ���������ϸ��
 * */
public class Test {
	public static void main(String[] args) {
		ComputerCommand c = new ComputerCommand(new Recever());
		c.execute();
	}
}
