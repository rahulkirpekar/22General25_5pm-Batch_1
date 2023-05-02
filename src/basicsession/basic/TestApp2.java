
import java.util.Scanner;

// java.lang----> System / String
public class TestApp2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// 1) Variable Declare---"Local Variable"
		float no1,no2,ans;

		// 2) Variable Initialisation
		System.out.println("Enter No1 : ");
		no1 = sc.nextFloat();	
		System.out.println("Enter No2 : ");
		no2 = sc.nextFloat();	

		System.out.println("No1 : " + no1);
		System.out.println("No2 : " + no2);
	
		ans = no1 + no2;
		System.out.println("Addition : " + ans);	
	}
}