public class advance extends ticket
{
	private int daysLeft;
	
	public advance()
	{
		super();
	}
	
	public advance(int days)
	{
		this.daysLeft = days;
	}
	
	public double getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30.00;
		}
		else return 40.00; 
	}
}