public class GameRunner {
	public static void main(String[] args) {
		GameSystem pc = new PC();
		GameSystem ps = new PlayStation();
		GameSystem xb = new XBox();
	    
		System.out.println(pc);
		System.out.println(ps);
		System.out.println(xb);
	}
}