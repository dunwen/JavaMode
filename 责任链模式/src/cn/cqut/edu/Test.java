package cn.cqut.edu;

public class Test {
	public static void main(String[] args) {
		Link l1 = new LinkLess10();
		Link l2 = new LinkLess20();
		Link l3 = new LinkOther();
		
		l1.next = l2;
		l2.next = l3;
		
		l1.exec(5);
		l1.exec(11);
		l1.exec(30);
		
	}
}
