import java.util.*;
class Account
	{
		int acc_no;
		String name;
		String acc_type;
		float amount,balance;
		
		Account(int acc_no,String name,String acc_type,float balance)
			{
				this.acc_no = acc_no;
				this.name = name;
				this.acc_type = acc_type;
				this.balance = balance;
			}	
			
		public void Deposit(float amount)
			{
				balance += amount;
			}
		public void Withdraw(float amount)
			{
				balance -= amount;
			}
		public void display()
			{
				System.out.println("Account Number = "+acc_no);
				System.out.println("Name = "+name);
				System.out.println("Account Type = "+acc_type);
				System.out.println("Balance = "+balance);
			} 
	}
	
class java9_1
	{
		public static void main(String[] args)
			{
				Scanner ob = new Scanner(System.in);
				
				int acc_no;
				String name;
				float balance,amount;
				String acc_type;
				
				Account ac[] = new Account[5];
				
				for(int i=0;i<2;i++)
				{
							System.out.println("Enter the Account Number: ");
							acc_no = ob.nextInt();
							ob.nextLine();
							System.out.println("Enter the Account Holder Name : ");
							name = ob.nextLine();
							System.out.println("Enter the Account Type: ");
							acc_type = ob.nextLine();
							System.out.println("ENter the balance: ");
							balance = ob.nextFloat();
							
							ac[i] = new Account(acc_no,name,acc_type,balance);
				}
				
				int j=0;
				
				while(j <= 5)
				{	
					System.out.println("MENU");
					System.out.println("1.Deposit 2.Withdraw 3.Display Account Details");
					int ch = ob.nextInt();	
				switch(ch)
					{
							
						case 1: System.out.println("Enter the AMount to Deposit: ");
							amount = ob.nextFloat();
							ac[j].Deposit(amount);
							break;
							
						case 2:	System.out.println("Enter the Amount to Withdraw: ");
							amount = ob.nextInt();
							ac[j].Withdraw(amount);
							break;
								
						case 3: System.out.println("Account Details: ");
							ac[j].display();
							break;
						default : System.out.println("Invalid");
							break;
					}
				}
			}
	}
