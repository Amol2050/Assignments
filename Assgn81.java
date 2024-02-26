package assignments;

public class Assgn81 
{

	public static void main(String[] args)
	{
		String str = "GroTechMindsBatch37";
		int count_Alpha = 0;
		int count_No = 0;
		
		boolean answer;
		
		char ch[] = str.toCharArray();
		
		for(int i =0; i<str.length();i++)
		{
			answer = Character.isDigit(ch[i]);
			if(answer == true)
			{
				count_No++;
			}
			else
			{
				count_Alpha++;
			}
			
		}
		System.out.println("Total Numbers are "+count_No);
		System.out.println("Total Numbers are "+count_Alpha);
		
		
	}

}
