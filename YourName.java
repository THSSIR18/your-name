import java.util.Scanner;
public class YourName
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("My name is Myles and I am 16");
		String name2="Myles";
		int age2 =16;
		int count=0;
		while (count <5)
		{
			count+=1;
			System.out.print("Enter your name: ");
			String name1=sc.nextLine();
			System.out.print("Enter your age: ");
			int age =sc.nextInt();
			sc.nextLine();
			String answer = isOlder(age,age2);
			System.out.println(name1 + " is " + answer + " " + name2+ '\n');
		}
	}
	public static String isOlder(int x, int y)
	{
		if (x==y)
		{
			return "the same age as";
		}
		else
		{
			if (x<y)
			{
				return "younger than";
			}
			else
			{
				
				return "older than";	
				
			}
		}
	}
}