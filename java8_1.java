/*Program to demonstrate use of command line arguments to initialize values to
member variables in a class and to display them.
Hint:- Create a class containing Rlno, stud_name, engmark, mathsmark,
totalmark. While executing the program we have to pass arguments through
command line. These values are obtained in an array which is passed as
argument to main function, here it is args[ ]. The marks are converted
correspondingly and then passed to constructor where values are stored to
class variables. Find the total marks and later displayed using display
function.*/

class Student
{
public int rollno;
public String stud_name;
public int mark1,mark2,total;

public Student(int rno,String name,int eng,int maths)
{
rollno = rno;
stud_name = name;
mark1 = eng;
mark2 = maths;
}

void compute(int eng,int maths)
{
total = eng + maths;
}

void display()
{
System.out.println("ROll no : "+rollno);
System.out.println("Name : "+stud_name);
System.out.println("English Mark : "+mark1);
System.out.println("Maths Mark : "+mark2);
System.out.println("Total Marks : "+total);
}
 
}

class java8_1
{
public static void main(String[] args)
{
int rno,mark1,mark2,total;
String name;

rno = Integer.parseInt(args[0]);
mark1 = Integer.parseInt(args[1]);
mark2 = Integer.parseInt(args[2]);
name = args[3];

Student ob = new Student(rno,name,mark1,mark2);
ob.compute(mark1,mark2);
ob.display();
}
}
