package corejava_assignments;

import java.util.ArrayList;

public class O52_coreJava_retrieve {
	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('F');
		list.add('G');
		list.add('H');

		System.out.println(list);

		Character f1 = list.getFirst();//make object and get element
		System.out.println("The first Element is " + f1);

		Character se = list.get(1);
		System.out.println("The second Element is " + se);

		System.out.println("THw Fifth Element is " + list.get(4)); 

		System.out.println(" The Last Element is " + list.getLast());
	}

}
