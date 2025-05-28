//Implement parameterized constructor using student class

import java.util.*;
class Student
{
String stud_name;
int stud_rollno;
int stud_marks;

public Student(String name,int rno,int marks)
{
stud_name = name;
stud_rollno = rno;
stud_marks = marks;
}
void display()
{
System.out.println("Name = "+stud_name);
System.out.println("Name = "+stud_rollno);
System.out.println("Name = "+stud_marks);
}
}

public class java7_3
{
public static void main(String[] args)
{
Scanner ob1 = new Scanner(System.in);
int rno,marks;
String name;
System.out.println("Enter the rollno,marks,name: ");
rno = ob1.nextInt();
marks = ob1.nextInt();
name = ob1.next();
Student ob = new Student(name,rno,marks);
ob.display();
}
}
