package assignments;

import java.util.Arrays;

public class Assgn65 
{

	public static void main(String[] args) 
	{
		String str[] = new String[3];
		str[0] = "Amol";
		str[1] = "nandkishor";
		str[2] = "Deshmukh";
		
		String str2[] = new String[3];
		for(int i=0; i<3;i++)
		{
		str2[i]=str[i];
		}
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
	}

}
