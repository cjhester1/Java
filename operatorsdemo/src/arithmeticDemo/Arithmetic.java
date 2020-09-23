package arithmeticDemo;

public class Arithmetic {

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Arithmetic i = new Arithmetic();
		
		 i.addition(0, 9);
		 i.subtraction(18, 9);
		 i.mult(18, 9);
		 i.div(18, 9);
		 i.mod(18, 9);
		 i.increment(3);
		 i.decrement(4);
	
	}
	
	public int addition(int a, int b) 
	
	{
	int res = a + b;
	System.out.println("result is " + res);
	return res;
	}
	
	public int subtraction(int a, int b) 
	
	{
	int res = a - b;
	System.out.println("result is " + res);
	return res;
	}
	
	public int mult(int a, int b) 
	{
	int res = a*b;
	System.out.println("result is " + res);
	return res;
	}
	
	public int div(int a, int b)
	{
	int res = a/b;
	System.out.println("result is " + res);
	return res;
	}
	
	public int mod(int a, int b) 
	{
	int res = a%b;
	System.out.println("result is " + res);
	return res;
	}
	
	public int increment(int a) 
	{
	int res = ++a;
	System.out.println("result is " + res);
	return res;
	}

	public int decrement(int a) 
	{
	int res = --a;
	System.out.println("result is " + res);
	return res;
	}
	

	
	
	

}
