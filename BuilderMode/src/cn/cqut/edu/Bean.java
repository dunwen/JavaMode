package cn.cqut.edu;

public class Bean {
	private int _id = -1;
	private String name = "";
	private String address = "";
	private String mode = "";
	
	public Bean() {}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	
	@Override
	public String toString() {
		return "Bean [_id=" + _id + ", name=" + name + ", address=" + address
				+ ", mode=" + mode + "]";
	}



	/**
	 * Bean的内部builder类
	 * */
	public static class Builder{
		public Builder(){}
		Bean b = new Bean();
		
		
		public Builder setId(int id){
			b.set_id(id);
			return this;
		}
		public Builder setName(String name){
			b.setName(name);
			return this;
		}
		public Builder setAddress(String addr){
			b.setAddress(addr);
			return this;
		}
		public Builder setMode(String mode){
			b.setMode(mode);
			return this;
		}
		public Bean create(){
			return b;
		}
		
	}
	
}
