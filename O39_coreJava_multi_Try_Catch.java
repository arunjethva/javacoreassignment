package corejava_assignments;

public class O39_coreJava_multi_Try_Catch {
	public static void main(String[] args) {

		System.out.println("program Start");

		try {
			int a[] = new int[1/0];
			try {
				a[5] = 30 / 0;
			} catch (ArithmeticException e) {
				System.out.println("catch 1 is running...");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch 2 is running....");
		}
		
	}
}
