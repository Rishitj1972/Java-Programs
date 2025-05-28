/* Write a java program for implementing user defined exception
Hint:- create a user defined exception called InvalidAgeException where if
the user age < 18 then throw the exception otherwise display “you are
eligible to vote */

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

class java20_3
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		
		try{
		
		System.out.println("Enter the Age : ");
		int age = ob.nextInt();
		
		if(age < 18)
		{
			throw new InvalidAgeException("Age must be greater than 18.");
		}
		else
		{
			System.out.println("Permitted");
		}
	}catch(InvalidAgeException e)
	{
		System.out.println("Error : "+e.getMessage());
	}
	finally
	{
		System.out.println("Program Completed");
	}
	}
}
