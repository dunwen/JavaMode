package cn.cqut.edu;

public class Game {
	public int leave = 0;
	public String name = "";
	
	public Memoto save(){
		Memoto memoto = new Memoto();
		memoto.leave = leave;
		memoto.name = name;
		return memoto;
	}
	
	public void restore(Memoto m){
		this.name = m.name;
		this.leave = m.leave;
	}

	@Override
	public String toString() {
		return "Game [leave=" + leave + ", name=" + name + "]";
	}
	
	
}
