public class calculator1
{
public void multi(int i, int j)
{
 int k=i*j;
 System.out.println(k);
}
public void Div(int i, int j)
{
 int k=i/j;
 System.out.println(k);
}
public static void main(String[]args)
{
 calculator1 cal=new calculator1();
	cal.multi(2,20);
	cal.Div(100,20);
}
}