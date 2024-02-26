package assignments;

public class Assgn79 
{

	public static void main(String[] args) 
	{
			String str = "Amol1234";
			char c[] = str.toCharArray();
			boolean Answer;
			
			for(int i=0; i<str.length();i++)
			{
				Answer = Character.isDigit(c[i]);
				if(Answer == true)
				{
					System.out.println("Digit "+ c[i]+" AT Index "+ i);
					
				}
				else
				{
					System.out.println("Digit "+ c[i]+" AT Index "+ i);
				}
			}
	}

}
