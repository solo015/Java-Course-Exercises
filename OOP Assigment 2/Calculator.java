/*
Task # 3
Create a class calculator. Create an equivalent four function calculator. When it finishes calculation, the 
program should ask whether the user wants to do another calculation. The response can be ‘y’ or ‘n’.
Enter first number, operator and second number: 10 / 3
Answer = 3.333333
Do another (y/n) ? y
Enter first number, operator and second number: 12 + 100
Answer = 112
Do another (y/n) ? n
*/
import java.util.Scanner;
public class Calculator {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
Calculator obj=new Calculator();

while(true){
	
	obj.result();
	System.out.print("Do another (y/n) ? ");
		if(s.next().charAt(0)==('y'))
			System.out.println("\n================================================================\nProgrammed by Saifullah Khan");
		break;
}
}
public void result(){
	Scanner s=new Scanner(System.in);
	CalculatorEncap obj=new CalculatorEncap();
	System.out.print("Enter first number, operator and second number: ");
	
	obj.setNum1(s.nextFloat());
	char ch = s.next().charAt(0);
	obj.setCh(ch); 
	obj.setNum2(s.nextFloat());

	float a=obj.getNum1();
	float b=obj.getNum2();
	switch(ch){
		case '+':
		System.out.println(obj.getNum1()+" + "+ obj.getNum2()+ " = "+ (a+b));
		break;
		case '-':
		System.out.println(obj.getNum1()+" - "+ obj.getNum2()+ " = "+ (a-b));
		break;
		case '*':
		System.out.println(obj.getNum1()+" * "+ obj.getNum2()+ " = "+ (a*b));
		break;
		case '/':
		System.out.println(obj.getNum1()+" / "+ obj.getNum2()+ " = "+ (a/b));
		break;
		case '%':
		System.out.println(obj.getNum1()+" % "+ obj.getNum2()+ " = "+ (a%b));
		break;
		default:
		System.out.println("Enter a valid Symbol");
	}
	

	
}
}
class CalculatorEncap {
	private float num1;
	private float num2;
	private char ch;
	public void setNum1(float num1){
		this.num1=num1;
	}
	public void setNum2(float num2){
		this.num2=num2;
	}
	public void setCh(char ch){
		this.ch=ch;
	}
	public float getNum1(){
		return this.num1;
	}
	public float getNum2(){
		return this.num2;
	}
	public char getCh(){
		return this.ch;
	}
}