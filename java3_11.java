//Program to check alphabet, digit or special character
class java3_11
{
public static void main(String arg[])
{
char ch = arg[0].charAt(0);

if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
{
System.out.println("Alphabet");
}
else if(ch >= '1' && ch <= '9')
{
System.out.println("Number");
}
else
{
System.out.println("Special character");
}
}
}
