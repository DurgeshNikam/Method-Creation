public class calculator
{
public void add(int i, int j)
{
int result= i+j;
System.out.println(result);
}
public void sub(int i, int j)
{
int result= i-j;
System.out.println(result);
}
public static void main(String[]args)
{
	calculator cal = new calculator();
		cal.add(100,200);
		cal.sub(500,300);
}
}