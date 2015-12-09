package cn.cqut.edu;


/*
 * 可以用List 等数据结构保存备份类Memoto，那么就可以做到多次恢复，通过对下标的访问就可以做到撤销备份或者回退多次备份
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
