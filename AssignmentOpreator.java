import java.util.Scanner;
class AsssignmentOpreator
{
	public static void main (String [] args )
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number a");
		int a= s.nextInt();
		System.out.println("Enter Number b");
		int b= s.nextInt();
		System.out.println("a=b:" + (a+b));
		System.out.println("Substraction:" + (a-b));
		System.out.println("Division:" + (a/b));
		System.out.println("Multiplication:" + (a*b));
	}
}


