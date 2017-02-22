public class XBox extends Console {
	public String platform;
	public int serialNo;
	
	public XBox() {
		super();
	}
	
	public XBox(String p) {
		super(p);
	}
	
	public int getSerialNo() {
		return super.getSerialNo();
	}
	
	public String getController() {
		return "XBox Wireless Controller";
	}
	
	public String getPlatform() {
		return "XBox";
	}
	
	public String toString() {
		return super.toString();
	}
}