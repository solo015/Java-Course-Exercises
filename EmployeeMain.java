/*
Task # 5
Create an employee class. The member data should comprise an int for storing the employee number 
and a float for storing the employee’s salary. Member functions should allow the user to enter this data 
and display it. Write a main() that allows the user to enter data for three employees and display it.
 
*/
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		Employee employee=new Employee(); 
		Data data=new Data();
		
		//System.out.println("Enter The number and Salary of Employee");
		//1st loop
		for (int a=1; a<=3; a++){
			System.out.println("Enter The number and Salary of "+a+" Employee");
		String number=s.next();
		float salary=s.nextFloat();
		data.setNumber(number);
		data.setSalary(salary);
employee.setData(data);
		}
		
		//2nd loop
		for(int i=1; i<=3; i++){
			System.out.println("\n\t"+i+" Employee Details");
			System.out.println("Number : "+employee.getData().getNumber());
			System.out.println("Salary"+employee.getData().getSalary());
		}
	}
	
	}
	//Association Model
class Employee {
	
	private Data data;
	public void setData(Data data){ this.data=data;}
	public Data getData(){ return this.data; }
}
class Data {
	//private identifiers
	private String[] number=new String[3];
	private float[] salary=new float[3];
	private byte counter=0;
	private byte counter2=-1;
	//setNumber
	public void setNumber(String number){ this.number[counter]=number; }
	//Set Salary
	public void setSalary(float salary){ this.salary[counter]=salary; counter++;}
	//get number
	public String getNumber(){ ++(this.counter2); return this.number[0]; }
	//get Salary 
	public float getSalary(){ return this.salary[0];  }
}
