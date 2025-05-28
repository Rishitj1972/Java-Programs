//Implement the concept of class and object using the student class

import java.util.*;
class Student
{
String stud_name;
void get_data(String name)
{
stud_name = name;
System.out.println("Student Name is : "+stud_name);
}
}

public class java7_1
{
public static void main(String[] args)
{
String stud_name;
Scanner ob1 = new Scanner(System.in);
Student ob2 = new Student();
System.out.println("Enter the student name: ");
stud_name = ob1.next();
ob2.get_data(stud_name);
}
}

