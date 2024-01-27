package corejava_assignments;

import java.util.ArrayList;

public class O53_coreJava_update {
	public static void main(String[] args) {

		ArrayList<String > colors = new ArrayList<String>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("orange");
		colors.add("White");
		
		
		System.out.println(colors);
		
		colors.set(2, "pink");
		
		System.out.println(colors);
		
		
		

	}

}
