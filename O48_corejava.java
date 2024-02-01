package corejava_assignments;

class Deamon extends Thread {

	public void run() {
		if (currentThread().isDaemon()) {
			System.out.println("Deamon Thread");
		} else {
			System.out.println("Not Deamon Thread");
		}
	}
}

public class O48_corejava {
	public static void main(String[] args) {

		Deamon t1 = new Deamon();
		Deamon t2 = new Deamon();
		Deamon t3 = new Deamon();

		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();

	}

}
