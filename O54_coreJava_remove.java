package corejava_assignments;

import java.util.ArrayList;

public class O54_coreJava_remove {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Charry");
		fruits.add("greps");
		fruits.add("Chiku");
		fruits.add("Watermelon");
		fruits.add("Barry");
		fruits.add("Banana");
		
		System.out.println(fruits);
		
		fruits.remove(3);
		System.out.println(fruits);
		

	}

}
