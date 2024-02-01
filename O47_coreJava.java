package corejava_assignments;

class Twice extends Thread {
	public void run() {
		System.out.println("Running.......");
	}
}

public class O47_coreJava {
	public static void main(String[] args) {

		Twice t1 = new Twice();

		t1.start();
		t1.start();

	}
}
