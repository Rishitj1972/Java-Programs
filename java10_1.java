import java.util.*;

class Product
{
	int pcode;
	String pname;
	float price;
	
	Product(int code,String name,float price)
	{
		pcode = code;
		pname = name;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Pcode : "+pcode);
		System.out.println("Name : "+pname);
		System.out.println("Price : "+price);
	}
}

class java10_1
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		Product p[] = new Product[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Pcode : ");
			int pcode = ob.nextInt();
			System.out.println("Enter the Name : ");
			String name = ob.next();
			System.out.println("Enter the Price : ");
			float price = ob.nextFloat();
			
			p[i] = new Product(pcode,name,price);
		}
		
		Product lowest = p[0];
		
		for(int i=0;i<3;i++)
		{
			if(p[i].price < lowest.price)
			{
				lowest = p[i];
			}
		}
		System.out.println("Details of Employee : ");
		lowest.display();
	}
}
