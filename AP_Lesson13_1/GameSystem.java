public abstract class GameSystem {
	public String platform;
	public int serialNo;
	
	public GameSystem() {
		platform = "";
	}
	
	public GameSystem(String p) {
		platform = p;
		serialNo = (int)(Math.random() * 1000000);
	}
	
	public abstract String getPlatform();
	
	public int getSerialNo() {
		return serialNo;
	}
}