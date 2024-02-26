//WAP to remove all the alphabets from below String "grotechminds1234"

package assignments;

public class Assgn72 
{

	public static void main(String[] args) 
	{
		String name = "grotechminds1234";
		char c1[] = name.toCharArray();
		for(int i =0; i<name.length();i++)
		{
			boolean answer = Character.isDigit(c1[i]);
			if(answer==true)
			{
				System.out.print(c1[i]);
			}
		}
		
	}

}
