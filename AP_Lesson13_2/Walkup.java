public class Walkup extends Ticket {
	public double price;
	
	public Walkup() {
		super();
	}
	
	public double getPrice() {
		return 50.00;
	}
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String toString() {
		return super.toString();
	}
}