/*
 5. Define a class Student and create instance members as id, name and age. 
Define id as static where the id will start with 1001 and the next id will be 
updated as 1002 and so on. Create five objects of students and display them. 
Sample Run
ID : 1001 
Name : AAA 
Age : 20 
ID : 1002 
Name : DDD 
Age : 21 
ID : 1003 
Name : BBB 
Age : 23 
ID : 1004 
Name : EEE 
Age : 25 
ID : 1005 
Name : CCC 
Age : 18

 */
public class Student

{

 private String firstName;

 private String lastName;

 private int age;

 private long IDNumber;

 private int gender;

 private double firstGrade;

 private double secondGrade;

 private double thirdGrade;

 private double x;

 private double Average;

     

    public Student(String a, String b, int c, long d, int e, double f, double g, double h)
    {
     firstName = a;
     lastName = b;
     age = c;
     IDNumber = d;
     gender = e;
     firstGrade = f;
     secondGrade = g;
     thirdGrade = h;
    }
     

    public String getfirstName()

    {

     return firstName;

    }

     

    public String getlastName()

    {

     return lastName;

    }

     

    public int getage()

    {

     return age;

    }

     

    public long getIDNumber()

    {

     return IDNumber;

    }

     

    public int getgender()

    {

     return gender;

    }

     

    public double getfirstGrade()

    {

     return firstGrade;

    }

     

    public double getsecondGrade()

    {

     return secondGrade;

    }

     

    public double getthirdGrade()

    {

     return thirdGrade;

    }

     

    public void setfirstGrade(double x)

    {

     firstGrade = x;

    }

     

    public void setsecondGrade(double x)

    {

     secondGrade = x;

    }

     

    public void setthirdGrade(double x)

    {

     thirdGrade = x;

    }

     

    public double calculateAverage()

    {

     Average = firstGrade + secondGrade + thirdGrade;

     return Average;

    }

     

    public String toString()

    {

     return "First Student: [First Name: " + firstName + "] [Last Name: " + lastName + "] [Age: " + age + "] [ID: " + IDNumber + "] [Gender: " + gender + "] [Grades : " + firstGrade + ", " +secondGrade + " and " + thirdGrade + "] [Average: " + Average + "]";

    }

     

 public static void main(String args[])

    {

     Student first = new Student("Fouad", "Mouawad", 20, 200904935, 0, 89, 92, 92);

     System.out.println("\n" + first);

      

     Student second = new Student("Maha", "Diab", 10, 200904965, 1, 89, 92, 92);

     System.out.println("\n" + second);

      

     Student third = new Student("Amer", "Mouawad", 10, 200904975, 0, 89, 92, 92);

     System.out.println("\n" + third);

      

     double Overalaverage = ( first.getfirstGrade() + second.getfirstGrade() + third.getfirstGrade() + first.getsecondGrade() + second.getsecondGrade() + third.getsecondGrade() + first.getthirdGrade() + second.getthirdGrade() + third.getthirdGrade() ) / 9;

     System.out.println("\nOverall Average: " + Overalaverage);

     double AverageAge = ( first.getage() + second.getage() + third.getage() ) / 3;

     System.out.println("Average age: " + AverageAge);

      

     int Gender = first.getgender() + second.getgender() + third.getgender();

     System.out.println("\nThere are " + Gender + " female(s) in the classe.");

     int male = 3-Gender;

     System.out.println("there are " + male + " male(s) in the classe.");

    }

}
