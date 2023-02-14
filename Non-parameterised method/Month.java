public class Month
{
	public void m1()
	{

		System.out.println("january");
		m2();
	}

	public void m2()
	{
	System.out.println("February");
	m3();
	}


	public void m3()
	{
		System.out.println("March");
		m4();
	}
	public void m4()
	{
		System.out.println("April");
		m5();
	}
	public void m5()
	{
		System.out.println("May");
	}
	public static void main(String[]args)
	{
		Month mon=new Month();
		mon.m1();
	System.out.println("Durgesh");
	}
}