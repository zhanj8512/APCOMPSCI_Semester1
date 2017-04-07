public class playstation extends console {
	public String platform;
	public int serialNo;
	
	public playstation() {
		super();
	}
	
	public playstation(String p) {
		super(p);
	}
	
	public String getController() {
		return "PS DualShock 3";
	}
	public String getPlatform() {
		return "PlayStation";
	}
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String toString() {
		return super.toString();
	}
}