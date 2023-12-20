import java.util.Scanner;
class Subject
{
	int subj_marks;
	int grade;
	int credits;
}
class Student
{
	String name;
	String usn;
	double SGPA;
	Scanner s;
	Subject subj[];
	Student()
	{
		int i;
		subj=new Subject[8];
		for(i=0;i<8;i++)
		    subj[i]=new Subject();
		s=new Scanner(System.in);
	}
	void getStudentDetails()
	{
		System.out.print("Enter Student Name: ");
		name=s.next();
		System.out.print("Enter USN: ");
		usn=s.next();
	}
	void getMarks()
	{   s=new Scanner(System.in);
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter details for subject "+(i+1)+":");
			System.out.print("Enter marks of student: ");
			subj[i].subj_marks=s.nextInt();
			System.out.print("Enter credits of subject: ");
			subj[i].credits=s.nextInt();
			if(subj[i].subj_marks>=90)
			{
				subj[i].grade=10;
			}
			else if(subj[i].subj_marks>=80)
			{
				subj[i].grade=9;
			}
			else if(subj[i].subj_marks>=70)
			{
				subj[i].grade=8;
			}
			else if(subj[i].subj_marks>=60)
			{
				subj[i].grade=7;
			}
			else if(subj[i].subj_marks>=50)
			{
				subj[i].grade=6;
			}	
			else if(subj[i].subj_marks>=40)
			{
				subj[i].grade=5;
			}
			else
			{
				subj[i].grade=0;
			}
		}
	}
	void computeSGPA()
	{
		double totalcredits=0;
		double weightedSum=0;
		for(int i=0;i<8;i++)
		{
			totalcredits+=subj[i].credits;
			weightedSum+=subj[i].grade*subj[i].credits;
		}
		SGPA=weightedSum/totalcredits;
	}
	void DisplayDetails()
	{
		System.out.println("\nStudent Details:");
		System.out.println("Name: "+name);	
		System.out.println("USN: "+usn);	
		System.out.println("SGPA: "+SGPA);
	}
}
public class StudentSGPAMain
{
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();
		s1.DisplayDetails();
	}
}