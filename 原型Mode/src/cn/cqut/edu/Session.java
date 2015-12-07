package cn.cqut.edu;

/**
 * 该类只能初始化的时候设置User实例，后续对User的引用不能修改User实例的参数。
 * */
public class Session {
	private User u;
	private static Session mSession= null;

	private Session(){}

	public static Session getSession(){
		if(mSession==null){
			mSession = new Session();
		}
		return mSession;
	}
	
	public void setU(User u) {
		this.u = u;
	}
	
	/**
	 * 测试用方法，看是否对user的克隆进行修改会不会对session中的user修改
	 * */
	public User getRealU(){
		return u;
	}
	
	
	/**
	 * 返回的应该是user的克隆并不是u的指针，
	 * 假若返回user的指针，则可以通过user的方法对不可改变的Session类中的User中修改
	 * */
	public User getU() {
		User newUser = null;
		try {
			newUser = u.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return newUser;
		
	}
		

}
