package assignments;

import java.util.Arrays;

public class Assgn64 
{

	public static void main(String[] args) 
	{
		String str[] = new String[3];
		str[0] = "Amol";
		str[1] = "nandkishor";
		str[2] = "Deshmukh";
		for(int i=0; i<3;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		
	}

}
