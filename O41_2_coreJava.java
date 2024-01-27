package corejava_assignments;

public class O41_2_coreJava extends Exception
{

	int ag;
	
	public O41_2_coreJava(int ag) 
	{
		
		this.ag=ag;
		
	}
	
	public void agenotvalid() 
	{
		
		System.err.println("You need "+ ag + " more age then you get vote");
		
		
		
	}

}
