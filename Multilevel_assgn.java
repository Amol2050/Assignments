package assignments;

interface State1
{
	void state_tax();
	void state_gst();
}

interface Country1
{
	void Country_tax();
	void Country_gst();
}

interface Continent
{
	void Continent_method();
}

interface Earth
{
	void Earth_method();
}
public class Multilevel_assgn implements State1,Country1,Continent,Earth
{

	public static void main(String[] args) 
	{
		Multilevel_assgn a = new Multilevel_assgn();
		a.Country_gst();
		a.Country_tax();
		a.state_gst();
		a.state_tax();
		a.Continent_method();
		a.Earth_method();
	}
	public void Country_tax() 
	{
		System.out.println("Country tax method");
	}
	public void Country_gst() 
	{
		System.out.println("Country gst method");
	}
	public void state_tax() 
	{
		System.out.println("state tax method");
	}
	public void state_gst() 
	{
		System.out.println("state gst method");
	}
	
	public void Continent_method()
	{
		System.out.println("Continent method");
	}
	
	public void Earth_method()
	{
		System.out.println("Earth Method");
	
	
	}

}

