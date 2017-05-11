public class PC extends GameSystem{
	public String platform;
	public int serialNo;
	
	public PC() {
		super();
	}
	
	public PC(String p) {
		super(p);
	}
	
	public String getPlatform() {
		return super.platform;
	};
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String systemInput() {
		return "Keyboard and Mouse";
	}
	
	public String toString() {
		return "Platform: " + getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nSystem Input: " + systemInput();
	}
}