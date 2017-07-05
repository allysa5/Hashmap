import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
//
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
//		System.out.println("Please enter a number.");
		Scanner keyboard = new Scanner(System.in);
		
		myMap.put(0,"zero");
		myMap.put(1,"one");
		myMap.put(2,"two");
		myMap.put(3,"three");
		myMap.put(4,"four");
		myMap.put(5,"five");
		myMap.put(6,"six");
		myMap.put(7,"seven");
		myMap.put(8,"eight");
		myMap.put(9,"nine");
		myMap.put(10,"ten");
		myMap.put(11,"eleven");
		myMap.put(12,"twelve");

		int key = keyboard.nextInt();
	
		String s = myMap.get(key);

		System.out.println(s);
		
			
	}

}

