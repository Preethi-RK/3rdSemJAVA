package CIE;
import java.util.Scanner;
public class student
{
	
	protected String usn = new String();
	protected String name = new String();
	protected int sem;
	
	public void inputStudentDetails()
	{
		Scanner s= new Scanner(System.in);

		System.out.print("Enter USN: ");
        	usn = s.nextLine();

        	System.out.print("Enter Name: ");
       		name = s.nextLine();

        	System.out.print("Enter Semester: ");
        	sem = s.nextInt();
	}

	public void displayStudentDetails()
	{
		System.out.println("USN: " + usn);
        	System.out.println("Name: " + name);
        	System.out.println("Semester: " + sem);
	}
}
		
	
	
