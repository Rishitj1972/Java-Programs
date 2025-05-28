import java.util.*;

class AuthException extends Exception
{
	public AuthException(String message)
	{
		super(message);
	}
}

class java21_3 
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
	
		try
		{
			System.out.println("Enter the Username : ");
			String uname = ob.next();
			
			System.out.println("Enter the Password : ");
			String passwd = ob.next();
				
			if(!uname.equals("Rishi") || !passwd.equals("1234"))
			{
				throw new AuthException("Authentication Failed,Give Correct Username and password");
			}
			else
			{
				System.out.println("Authentication Successfull.");
			}
		}catch(AuthException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		finally
		{
			System.out.println("Program Completed");
		}
	}
}

