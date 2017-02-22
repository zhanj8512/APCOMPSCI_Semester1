public class GameRunner {
	public static void main(String[] args) {
		Pc pc1 = new PC("pcplatform");
		PlayStation ps1 = new PlayStation("ps1");
		XBox xb1 = new XBox("xb1");
		
		System.out.println(pc1);
		System.out.println(ps1);
		System.out.println(xb1);
	}
}