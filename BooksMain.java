import java.util.Scanner;
class Books
{
	String name;
	String author;
	int price;
	int num_pages;
	Books(String name,String author,int price,int num_pages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}
	public String toString()

	{

		String name,author,price,num_pages;
		name = "Book name: " + this.name + "\n";
		author = "Author name: " + this.author + "\n";
		price = "Price: " + this.price + "\n";
		num_pages = "Number of pages: " + this.num_pages + "\n";
		return name+author+price+num_pages;
	}
}
class BooksMain
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		String name;
		String author;
		int price;
		int num_pages;
		System.out.println("Enter the no.of books: ");
		n=s.nextInt();

		Books[] b= new Books[n];
	//Books b[]; //array of objects
		//b=new Books[n];
		System.out.println("Enter details of "+n+" books:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of book "+(i+1)+":");
			name=s.next();
			System.out.println("Enter the author of book "+(i+1)+":");
			author=s.next();
			System.out.println("Enter the price of book "+(i+1)+":");
			price=s.nextInt();
			System.out.println("Enter the no.of pages of book "+(i+1)+":");
			num_pages=s.nextInt();
			b[i]=new Books(name,author,price,num_pages);
		}
		System.out.println("Details of "+n+" books:");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i].toString());
		}
	}
}

		
	
