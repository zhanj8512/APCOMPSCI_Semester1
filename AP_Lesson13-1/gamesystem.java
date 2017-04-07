public abstract class gamesystem {
	public String platform;
	public int serialNo;
	
	public gamesystem() {
		platform = "";
	}
	
	public gamesystem(String p) {
		platform = p;
		serialNo = (int)(Math.random() * 1000000);
	}
	
	public abstract String getPlatform();
	
	public int getSerialNo() {
		return serialNo;
	}
}