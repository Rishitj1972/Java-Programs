class CPU
{
	float price;
	
	CPU(float price)
	{
		this.price = price;
	}
	
	class Processor
	{
		int cores;
		String manufacturer;
		
		Processor(int cores,String manu)
		{
			this.cores = cores;
			manufacturer = manu;
		}
		void display()
		{
			System.out.println("Cores : "+cores);
			System.out.println("Manufactutrer : "+manufacturer);
		}
	}
	static class RAM
	{
		int memory;
		String manufacturer;
		
		RAM(int memory,String manu)
		{
			this.memory = memory;
			manufacturer = manu;
		}
		void display()
		{
			System.out.println("Memory : "+memory);
			System.out.println("Manufacturer : "+manufacturer);
		}
	}
}

class java10_2
{
	public static void main(String[] args)
	{
	CPU c = new CPU(12);
	CPU.Processor p = c.new Processor(4,"rishi");
	p.display();
	CPU.RAM r = new CPU.RAM(4,"rishi");
	r.display();
	}
}
