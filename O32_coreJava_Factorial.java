package corejava_assignments;
import java.util.Scanner;

class F
{
	int fact =1;
	public void Factorial(double num)
	{
		for(int i=1; i<=num; i++)
			
			fact = fact*i;
		
			System.out.println("The Factorial is :" + fact);
	}
}


public class O32_coreJava_Factorial {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The NO: ");
		int num = sc.nextInt();
		
		F d = new F();
		d.Factorial(num);

		
	}

}
