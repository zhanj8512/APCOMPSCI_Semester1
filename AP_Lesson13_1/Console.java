public abstract class Console extends GameSystem {
	public String platform;
	public int serialNo;
	
	public Console() {
		super();
	}
	
	public Console(String p) {
		super(p);
	}
	
	public abstract String getPlatform();
	
	public abstract String getController();
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String toString() {
		return "Platform: " + getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + getController();
	}
}