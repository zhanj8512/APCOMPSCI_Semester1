public abstract class ticket
{
	public ticket()
	{
		
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}