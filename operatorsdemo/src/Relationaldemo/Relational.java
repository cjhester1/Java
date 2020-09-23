package Relationaldemo;

public class Relational {
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Relational i = new Relational();
		i.Equal(3, 3);
		i.Equal(3, 4);
		i.notEqual(3, 5);
		i.notEqual(3, 3);
		i.greaterThan(4, 10);
		i.lessThan(99, 77);
		i.lessThanOrEqual(99, 100);
		i.greaterThanOrEqual(34, 67);
		i.greaterThanOrEqual(100, 67);
		

	}
	
	public boolean Equal(int a, int b)
	
	{
		if ( a != b) 
			{
				System.out.println(" "+a+" and "+b+" are not equal");
				return false;
			}
		
		if (a == b)
			{
			System.out.println(" "+a+" and "+b+" are  equal");
			
			}
		
		
		
	return true;
			
	}
	
	public boolean notEqual(int a, int b) 
	
	{
		if ( a == b) 
			
		{
			System.out.println(" "+a+" and "+b+" are equal");
			
			return false;
		}
		
		if ( a != b) 
		{
			System.out.println(" "+a+" and "+b+" are not equal");
		
		}
		
		return true;
	}
	
	public boolean lessThan(int a,int b)
	
	{
		if ( a > b) 
			{
				System.out.println(" "+a+" is greater than "+b+" ");
			
				return false;
			}
		
		if (a < b) 
			
			{
				System.out.println(" "+a+" is less than "+b+" ");
					
			}
	
	return true;	
	
	}
		
	public boolean greaterThan(int a , int b) 
	{
		if ( a < b) 
			{
				System.out.println(" "+a+" is less than "+b+" ");
			
				return false;
			}
		
		if (a > b) 
			
			{
				System.out.println(" "+a+" is greater than "+b+" ");
					
			}
	
	return true;
	}
	
	public boolean lessThanOrEqual(int a, int b) 
	{
		if ( a >= b) 
		{
			System.out.println(" "+a+" is greater than or equal to "+b+" ");
			
			return false;
		}
		
		if (a <= b) 
			
		{
			
			System.out.println(" "+a+" is less than or equal to "+b+" ");
					
		}
		
	return true;	
	}
	
	public boolean greaterThanOrEqual(int a, int b) 
	{
		if ( a <= b) 
		{
			System.out.println(" "+a+" is less than or equal "+b+" ");
			
			return false;
		}
		
		if (a >= b) 
			
		{
			
			System.out.println(" "+a+" is greater than or equal to "+b+" ");
					
		}
		
	return true;	
	}

}
