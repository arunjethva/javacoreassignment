package corejava_assignments;
import java.util.HashSet;
import java.util.Iterator;

public class O60_coreJava_iterate {
	public static void main(String[] args) {
		
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		
		
		Iterator<Integer> itr = set.iterator();
		System.out.println("The HashSet is :");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
	}

}
