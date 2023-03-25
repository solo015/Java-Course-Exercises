/*
Task # 5
Create an employee class. The member data should comprise an int for storing the employee number 
and a float for storing the employee’s salary. Member functions should allow the user to enter this data 
and display it. Write a main() that allows the user to enter data for three employees and display it.
 
*/
import java.util.Scanner;
public class Main {
	private int arr1=new int(3);
	private float arr2=new float(3);
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		
		
		Data data=new Data();
		
		Employee employee=new Employee();
		
		int a=1;
		while(a==3){
			int number=s.nextInt();
		float salary=s.nextFloat();
		setNumber(number);
		setSalary(salary);
employee.setData(data);
a++;
		}
		int i=1;
		while(i==3){
			System.out.println(i+" Employee");
			System.out.println(employee.getData().getNumber
		}
	}
	
	}
class Employee {
	private Data data;
	public void setData(Data data){ this.data=data;}
	public Data getData(){ return this.data; }
}
class Data {
	private int[] number=new int[3];
	private float[] salary=new float[3];
	private byte counter=0;
	private byte counter2=0;
	public void setNumber(int number){ this.number[counter]=number; }
	public void setSalary(float salary){ this.salary[counter]=salary; counter++;}
	public int getNumber(){ return this.number[0]; }
	public float getSalary(){ return this.salary[0]; ++counter2; }
}
