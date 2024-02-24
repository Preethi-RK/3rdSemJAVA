import java.util.*;
class wrongAge extends Exception
{
	wrongAge(String s)
	{
		super(s);
	}
	
}

class input
{
	int f_age;
	int s_age;
	Scanner sc= new Scanner(System.in);
	
	
}
class father extends input
{
	father() throws wrongAge
	{
		System.out.println("Enter father's age:");
		f_age = sc.nextInt();
		if(f_age < 0)
			throw new wrongAge("Age cannot be negative");
	}
	void display1()
	{
		System.out.println("Father's age is : "+f_age);
	}
}
class son extends father
{
	son() throws wrongAge
	{
		System.out.println("Enter son's age:");
		s_age = sc.nextInt();
		if (s_age > f_age)
		{
			throw new wrongAge("Son's age cannot be greater than father's age");
		}
		else if (s_age <0)
			throw new wrongAge("Age cannot be negative");
	}
	void display2()
	{
		System.out.println("Son's age is : "+s_age);
	}
}

class MainSon
{	
public static void main (String args[]){
	try 
	{
		son s =new son();
		s.display1();
		s.display2();
	}
	catch(wrongAge e)
	{
		System.out.println("Error : "+e);
	}
}
}
