package allAboutArray;

public class InsertArray {
	
	public static void main(String[] args) 
	{
		int ar[] = new int[10];
		ar[0] = 22;
		ar[1] = 24;
		ar[2] = 45;
		ar[3] = 67;
		ar[4] = 77;
		
		int n = 4;//element count
		System.out.println("Elements in array before insertion");
		
		for (int i = 0; i < n; i++) 
		{
			System.out.println(ar[i] + " ");
		}
		
		int newElement = 100;
		int pos = 5;//if for user if its 1 then for dev its 0 or (i-1)
		for (int i = n; i >= pos;i-- ) //here is how insert algo works
		{
			ar[i] = ar[i-1];//heres how insert algo works
		}
		
		ar[pos-1] = newElement;
		n++;
		
		System.out.println("Elements in array after insertion");
		
		for (int i = 0; i < n; i++) 
		{
			System.out.println(ar[i] + " ");
		}
		
		
		
	}
	

}
