//how to sort an Array in assending and decending order

package assignments;

import java.util.Arrays;

public class Assgn152 
{

	public static void main(String[] args) 
	{
		int a[] = {11,10,14,9};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++) 
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("-------------");
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]+"  ");
		}
	}

}
