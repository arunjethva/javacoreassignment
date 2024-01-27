package corejava_assignments;


class voting {

	int age;

	public void validage(int age) throws O41_2_coreJava
	{

		if (age < 18) {

			age = 18 - age;
			
			throw new O41_2_coreJava(age);

		} else 
		{
			
			System.out.println("Your are aligibel for vote");

		}

	}
}

public class O41_coreJava_votingException {
	public static void main(String[] args) {

		voting v = new voting();
		
		try {
			v.validage(20);
			System.out.println("Arun");
			
		} catch (O41_2_coreJava e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.agenotvalid();
		}
		
		
		
	}

}
