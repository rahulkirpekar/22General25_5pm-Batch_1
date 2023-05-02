import java.util.Scanner;
public class TestApp3
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character : ");
//		char value = (char)System.in.read(); 

		char value = sc.next().charAt(0);

		System.out.println("Value : " + value);

		//System.out.println("Enter FirstName : ");
		//String firstName = sc.next();

		//System.out.println("Enter FullName : ");
		//String fullName = sc.nextLine();

		//System.out.println("FirstName : " + firstName);
		//System.out.println("FullName : " + fullName);

	}
}