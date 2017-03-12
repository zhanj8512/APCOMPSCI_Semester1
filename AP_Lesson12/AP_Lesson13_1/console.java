public abstract class console extends GameSystem {
	public String platform;
	public int serialNo;
	
	public console() {
		super();
	}
	
	public console(String p) {
		super(p);
	}
	
	public abstract String getPlatform();
	
	public abstract String getController();
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String toString() {
		return "platform: " + getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + getController();
	}
}