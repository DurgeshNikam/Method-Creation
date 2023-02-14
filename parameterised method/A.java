public class A
{
	 public void m1(int i)
	{
	 m1();
	 System.out.println("m1--int--A");
	}
	 public void m2(String S)
	{
	 m2();
	 System.out.println("m2---String--A");
	}
	 public static void main(String[]args)
	{
	 A a=new A();
	   a.m1();
	   a.m2();
	}
}	