public class AFigure extends Toy {
	public String name;
	public int count;
	
	//constructors
	public AFigure() {
		super();
	}
	
	public AFigure(String s) {
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
		return "Action Figure";
	}
	
	public String toString() {
		return super.toString();
	}
}