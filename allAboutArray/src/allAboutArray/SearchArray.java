package allAboutArray;

import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {
		
		int ar[] = {11,22,33,44,55,65,34,67,43,66,65,23};	
		
		int searchElement = 65;
		
		boolean b = false;
		
		for(int i = 0; i<ar.length; i++) 
		{
			if (ar[i]== searchElement) 
			{
				b = true;
				System.out.println(searchElement + " found at position " + (i+1));
			}
			
		}
		for(int i = 0; i<ar.length; i++) 
		{
			if (ar[i]%2== 0) 
			{
				b = true;
				System.out.print(ar[i] + " ");
			}
			
		}
		
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		

	}

}
