public class human
publix static void main(String[]args)
{
	private String hair, eyes, skin;
	
	public human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	public human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String gethair()
	{
		return hair;
	}
	public String geteyes()
	{
		return eyes;
	}
	public String getskin()
	{
		return skin;
	}
}