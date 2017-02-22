public class Advance extends Ticket {
	public double price;
	private int daysLeft;
	
	public Advance() {
		super();
	}
	
	public Advance(int d) {
		super();
		daysLeft = d;
	}
	
	public double getPrice() {
		if (daysLeft >= 10) {
			return 30.00;
		}
		else {
			return 40.00;
		}
	}
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String toString() {
		return super.toString();
	}
}