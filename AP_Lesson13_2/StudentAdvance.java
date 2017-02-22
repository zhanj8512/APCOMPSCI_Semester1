public class StudentAdvance extends Advance {
	public double price;
	private int daysLeft;
	
	public StudentAdvance() {
		super();
	}
	
	public StudentAdvance(int d) {
		super();
		daysLeft = d;
	}
	
	public double getPrice() {
		if (daysLeft >= 10) {
			return 30.00/2;
		}
		else {
			return 40.00/2;
		}
	}
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String toString() {
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}