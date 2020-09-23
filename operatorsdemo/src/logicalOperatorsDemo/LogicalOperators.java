package logicalOperatorsDemo;

public class LogicalOperators {
	
	

	public static void main(String[] args)
	{
		LogicalOperators i = new LogicalOperators();
		
		i.and(2,4,5,6);
		i.and(2,4,8,6);
		i.or(2,4,5,6);
		i.not(2,4,5,6);
		i.and(10,4,8,6);
		i.or(12,34,15,16);
		i.not(42,54,57,61);

	}
	
	public void and(int a, int b, int c, int d) 
	{
		 if (a < b && c < d) 
		 {
			 
			 System.out.println("when comparing "+a+", "+b+" , "+c+" and "+d+" we see that the 'AND' logical operation is true! "); 
		 }
		 
		 else
			 
			 System.out.println("when comparing "+a+", "+b+" , "+c+" and "+d+" we see that the 'AND' logical operation is false! ");
		 
	}
	
	public void or(int a, int b, int c, int d) 
	{
		if (a < b || c < d)
		{
			System.out.println("when comparing "+a+", "+b+" , "+c+" and "+d+" we see that the 'OR' logical operation is true! ");
		}
		else
			 
			System.out.println("when comparing "+a+", "+b+" , "+c+" and "+d+" we see that the 'OR' logical operation is false! ");
	}
	
	public void not(int a, int b, int c, int d) 
	{
		 if (!(a < b && c < d)) 
		 {
			 
			 
			 System.out.println("when comparing "+a+", "+b+" , "+c+" and "+d+" we see that the 'NOT' logical operation is true! ");
		 }
		 
		 else
			 
			 System.out.println("when comparing "+a+", "+b+" , "+c+" and "+d+" we see that the 'NOT' logical operation is false! ");
		 	
	}

}
