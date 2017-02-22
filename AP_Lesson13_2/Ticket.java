public abstract class Ticket {
	public double price;
	
	public Ticket() {
		price = 0;
	}
	
	public int getSerialNo() {
		return (int)(Math.random() * 10000000);
	}
	
	public abstract double getPrice();
	
	public String toString() {
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}