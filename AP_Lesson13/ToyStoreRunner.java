public class ToyStoreRunner {
	public static void main(String[]args) {
		String toystr = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		
		ToyStore toystore1 = new ToyStore(toystr);
		System.out.println("List...");
		System.out.println(toystr);
		toystore1.printList();
		System.out.println("Most frequent toy: " + toystore1.getMostFrequentToy());
		System.out.println("Most frequent type of toy: " + toystore1.getMostFrequentType());
	}
}