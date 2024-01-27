package corejava_assignments;

public class O38_coreJava_multi_Catch {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;

		} catch (ArithmeticException e) {
			
		} catch (ArrayIndexOutOfBoundsException e) {

		}

	}
}
