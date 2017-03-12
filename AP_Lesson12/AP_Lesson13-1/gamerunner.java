public class gamerunner {
	public static void main(String[] args) {
		PC pc = new PC("borderlands");
		PlayStation ps = new PlayStation("battlefield");
		XBox xb = new XBox("nba2k");
		
		System.out.println(pc);
		System.out.println(ps);
		System.out.println(xb);
	}
}