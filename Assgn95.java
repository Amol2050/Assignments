//WAP to use getter and setter with int, char, boolean, string, float, double 
package assignments;

class In
{
	private int a = 20;
	private char c ='A';
	private boolean d = true;
	private float pi = 3.14f;
	private double e = 22.33;

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

public class Assgn95
{

	public static void main(String[] args) 
	{
		In a = new In();
		a.setA(22);
		a.setC('B');
		a.setD(false);
		a.setPi(11.22f);
		a.setE(33.44);
		System.out.println(a.getA());
		System.out.println(a.getC());
		System.out.println(a.isD());
		System.out.println(a.getPi());
		System.out.println(a.getE());
	}

}
