package conditionalOperatorDemo;

public class ConditionalOperator {
	
	

	public static void main(String[] args) 
	{
	ConditionalOperator i = new ConditionalOperator();
	i.testif(95, 91);
	i.testElseIf(81, 82);
	i.testElseIf(71, 75);
	i.testElseIf(64, 69);
	i.testElse(45, 55);
	i.testElse(35, 47);
	}
	
	public void testif (int a, int b) 
	{
		int examScore = a;
		int finalScore = b;
		
		if (examScore >= 90 && finalScore >= 90) 
		{
			
			System.out.println("Your final grade is an A!");
			
		}
	}
	
	public void testElseIf (int a, int b) 
	{
		int examScore = a;
		int finalScore = b;
		
		if (examScore >= 90 && finalScore >= 90) 
		{
			
			System.out.println("Your final grade is an A!");
			
		}
		
		else if (examScore >= 80 && finalScore >= 80)
		
		{
			System.out.println("Your final grade is a B!");
			
		}
		
		else if (examScore >= 70 && finalScore >= 70)
			
		{
			System.out.println("Your final grade is a C!");
			
		}
		
		else if (examScore >= 60 && finalScore >= 60)
			
		{
			System.out.println("Your final grade is a D!");
			
		}
	}
	
	public void testElse(int a, int b) 
	{
		int examScore = a;
		int finalScore = b;
		
		if (examScore >= 90 && finalScore >= 90) 
		{
			
			System.out.println("Your final grade is an A!");
			
		}
		
		else if (examScore >= 80 && finalScore >= 80)
		
		{
			System.out.println("Your final grade is a B!");
			
		}
		
		else if (examScore >= 70 && finalScore >= 70)
			
		{
			System.out.println("Your final grade is a C!");
			
		}
		
		else if (examScore >= 60 && finalScore >= 60)
			
		{
			System.out.println("Your final grade is a D!");
			
		}
		
		else
		{
			System.out.println("Your final grade is a F :(");
		}
		
		}
	}
	



