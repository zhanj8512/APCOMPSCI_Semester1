public class TicketDriver {
	public static void main(String[] args) {
		Walkup w1 = new Walkup();
		Advance a1 = new Advance(12);
		StudentAdvance sa1 = new StudentAdvance(20);
		
		System.out.println(w1);
		System.out.println(a1);
		System.out.println(sa1);
	}
}