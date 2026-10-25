import java.util.Scanner;
public class Grades 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		
		if (marks < 0 || marks > 100) 
		{
		    System.out.println("Invalid marks");
		} 
		    
		
		if(marks>=90)
		{
			System.out.println("You have received A grade");
		}
		else if(marks>=70) 
		{
			System.out.println("You have received B grade");
		}
		else if(marks>=60)
		{
			System.out.println("You have received C grade");
		}
		else if(marks>=40) 
		{
			System.out.println("You received D grade");
		}
		else
		{
			System.out.println("You have Failed");
		}
	}
}
		
