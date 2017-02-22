public class Car extends Toy {
	public String name;
	public int count;
	
	//constructors
	public Car() {
		super();
	}
	
	public Car(String s) {
		super(s);
	}
	
	//accessors
	public String getName() {
		return super.getName();
	}
	
	public int getCount() {
		return super.getCount();
	}
	
	//modifiers
	public void setName(String n) {
		super.setName(n);
	}
	
	public void setCount(int c) {
		super.setCount(c);
	}
	
	public String getType() {
		return "Car";
	}
	
	public String toString() {
		return super.toString();
	}
}