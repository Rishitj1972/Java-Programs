//Program to print day of week name using switch...case
class java3_10
{
public static void main(String arg[])
{
int n = Integer.parseInt(arg[0]);

switch(n)
{
case 1: System.out.println("sunday");
break;
case 2: System.out.println("Monday");
break;
case 3: System.out.println("Tuesday");
break;
case 4 : System.out.println("Wednesday");
break;
case 5 : System.out.println("Thursday");
break;
case 6 : System.out.println("Friday");
break;
case 7 : System.out.println("Saturday");
break;
default: System.out.println("Invalid choice");
break;
}
}
}
