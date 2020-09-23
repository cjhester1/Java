package bitwiseOperatorsDemo;

public class BitwiseOperator {
	
	

	public static void main(String[] args) 
	{
		BitwiseOperator i = new BitwiseOperator();
		
		i.and(60,13);
		i.bitCompliment(60);
		i.leftShift(60);
		i.rightShift(60);
		i.or(60, 13);
		i.xOR(60, 13);
		i.zeroFillRightShift(60);

	}
	
public int and(int a, int b) 
{
	int res = a&b;
	System.out.println("result is " + res);
	return res;
}

public int or(int a, int b) 
{
	int res = a|b;
	System.out.println("result is " + res);
	return res;
}

public int xOR(int a, int b) 
{
	int res = a^b;
	System.out.println("result is " + res);
	return res;
}

public int bitCompliment(int a) 
{
	int res = ~a;
	System.out.println("result is " + res);
	return res;
}

public int leftShift(int a) 
{
	int res = a<<2;
	System.out.println("result is " + res);
	return res;
}

public int rightShift(int a) 
{
	int res = a>>2;
	System.out.println("result is " + res);
	return res;
}

public int zeroFillRightShift(int a) 
{
	int res = a>>>2;
	System.out.println("result is " + res);
	return res;
}

}
