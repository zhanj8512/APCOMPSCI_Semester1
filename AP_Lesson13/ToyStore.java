import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
	public static ArrayList<Toy> toyList = new ArrayList<Toy>();
		
	public ToyStore() {
	}
	
	public ToyStore(String list) {
		loadToys(list);
	}
	
	public static void loadToys(String ts) {
		// takes String list of toys and uses loop to check if each toy is in the list
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i+=2) {
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			if (getThatToy(name) == null) {
				if (type.equals("Car")) {
					Car nextcar = new Car(name);
					toyList.add(nextcar);
				}
				if (type.equals("AF")) {	
					AFigure nextaf = new AFigure(name);
					toyList.add(nextaf);
				}
			}
			else {
				getThatToy(name).setCount(getThatToy(name).getCount() + 1);
			}
		}
	}
	
	public static Toy getThatToy(String nm) {
		// checks toyList by name to see if the toy is in the list
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getName().equals(nm)) {
				return toyList.get(i);
			}
			else {
				i++;
			}
		}
		return null;
	}
	
	public static String getMostFrequentToy() {
		// find the Toy (by name) that occurs most frequently in the list
		String name = "";
		int max = 0;
		for (int i = 0; i < toyList.size(); i++) {
			if (max < toyList.get(i).getCount()) {
				max = toyList.get(i).getCount();
				name = toyList.get(i).getName();
			}
		}
		return name;
	}
	
	public static String getMostFrequentType() {
		// finds the type of Toy that occurs most frequently in the list
		int cars = 0;
		int figures = 0;
		
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getType().equals("Car")) {
				cars++;
			}
			if (toyList.get(i).getType().equals("Action Figure")) {
				figures++;
			}
		}
		
		if (cars > figures) {
			return "Car";
		}
		else if (figures > cars) {
			return "Action Figure";
		}
		else {
			return "Equal amounts of actions figures and cars.";
		}
	}
	
	public static void printList() {
		System.out.println(toyList);
	}
}