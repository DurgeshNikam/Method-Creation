public class calculator
{
public  void add()
{
int X=100;
int Y=200;
int Z=X+Y;
System.out.println(Z);
}
public void sub()
{
int X=300;
int Y=400;
int Z=X-Y;
System.out.println(Z);
}
public static void main(String[]args)
{
System.out.println("Main Start");
calculator cal= new calculator();
cal.add();
cal.sub();
System.out.println("Main End");
}
}