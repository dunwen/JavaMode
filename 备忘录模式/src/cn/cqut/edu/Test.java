package cn.cqut.edu;


/*
 * ������List �����ݽṹ���汸����Memoto����ô�Ϳ���������λָ���ͨ�����±�ķ��ʾͿ��������������ݻ��߻��˶�α���
 * */
public class Test {
	public static void main(String[] args) {
		Game g = new Game();
		g.leave = 0;
		g.name = "sdf";
		
		Memoto m = g.save();
		Game newG = new Game();
		newG.restore(m);
		System.out.println(newG.toString());
		
	}
}
