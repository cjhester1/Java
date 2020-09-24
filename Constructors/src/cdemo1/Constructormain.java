package cdemo1;

public class Constructormain {

	public static void main(String[] args) {
		
		Constructordemo i = new Constructordemo("JAVA");//Calci(String)

		System.out.println("Result with c is  " + i.add());

		
		Constructordemo i1 = new Constructordemo(10, 999);
		System.out.println("Result with c1 add() is "+i1.add());
		System.out.println("Result with c1 multiply() is "+i1.multiply());
		
		Constructordemo i2=new Constructordemo(66, 66);
		System.out.println("Result with c2 add() is "+i2.add());
		System.out.println("Result with c2 multiply() is "+i2.multiply());
		

	}

}
