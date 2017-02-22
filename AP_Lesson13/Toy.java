public abstract class Toy {
	public String name;
	public int count;
	
	//constructors
	public Toy() {
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String s) {
		this.name = s;
		this.count = 1;
	}
	
	//accessors
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	
	//modifiers
	public void setName(String n) {
		name = n;
	}
	
	public void setCount(int c) {
		count = c;
	}
	
	public abstract String getType();
	
	public String toString() {
		return name + " " + count;
	}
}