public class studentadvance extends advance
{
	public studentadvance()
	{
		super();
	}
	
	public studentadvance(int days)
	{
		super(days);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\nstudent ID Required)";
	}
}