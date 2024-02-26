package assignments;

interface Amazon
{
	abstract void login();
	abstract void logout();
}

public class Assgn49 implements Amazon 
{

	public static void main(String[] args) 
	{
		Assgn49 a = new Assgn49();
		a.login();
		a.logout();			

	}
	public void login()
	{
		System.out.println("Login Method");
	}
	public void logout() 
	{
		System.out.println("Logout Method");
	}

}
