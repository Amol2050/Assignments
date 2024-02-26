//find out the area of a circle for ten times,take pi value from math.pi and take r value from math.random and solve this problem 10 times.
package assignments;

public class Assgn94 
{

	public static void main(String[] args)
	{
		//float r;
		//double pi;
		//double area;
		for(int i=0;i<=9;i++)
		{
			double r = Math.random();
			//System.out.println(r);
			System.out.println("---------------------------------------------");
			double pi = Math.PI;
			double area = pi*r*r;
			System.out.println(area);
			
			
		}

	}

}
