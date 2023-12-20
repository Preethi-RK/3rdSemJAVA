import java.util.Scanner;
import java.lang.Math;
class Quadratic
{
	float a,b,c;
	double r1,r2,d;
	void getd()
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the coefficients of a,b,c");
	   a=s.nextFloat();
	   b=s.nextFloat();
	   c=s.nextFloat();
	}
	void compute()
	{
	    while(a==0)
	    {
	        System.out.println("Not a quadratic equation");
	        System.out.println("Enter a non-zero value for a");
		    Scanner s=new Scanner(System.in);
		    a=s.nextFloat();
	    }
	    d=b*b-4*a*c;
	    if(d==0)
	    {
	        r1=(-b)/(2*a);
		    System.out.println("Roots are real and equal");
	        System.out.format("Root 1= Root 2= %.2f",r1);
	    }
	    else if(d<0)
	    {
	        System.out.println("Roots are imaginary");
	        r1=-b/(2*a);
	        r2=Math.sqrt(-d)/(2*a);
	        System.out.format("Root 1= %.2f+%.2fi",r1,r2);
	        System.out.format("Root 2= %.2f-%.2fi",r1,r2);
	    }
	    else
	    {
		    r1=(-b+Math.sqrt(d))/(2*a);	
		    r2=(-b-Math.sqrt(d))/(2*a);
	        System.out.println("Roots are real and distinct");
	        System.out.format("Root 1= %.2f and Root 2= %.2f",r1,r2);
	    }
	}
}
class QuadraticMain
{
	public static void main(String args[])
	{
	    Quadratic q=new Quadratic();
	    q.getd();
	    q.compute();
	}
}