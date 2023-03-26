// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*Task # 2
Create a class Temp. Write a temperature-conversion program that gives the user the option of 
converting Fahrenheit to Celsius or vice versa. Then carry out the conversion. Use floating point 
numbers:
Type 1 to convert Fahrenhiet to Celsius,
 2 to convert Celsius to Fahrenheit: 1
Enter temperature in Fahrenheit: 70 
In Celsius: 21.111111
*/
import java.util.Scanner;
//Main class
public class Temp{
	//Main class
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=1,b=2;
System.out.println("Type 1 to convert Fahrenhiet to Celsius,\ntype 2 to convert Celsius to Fahrenheit: ");
int choice=s.nextInt(); //Input Choice
float value=0f;
switch(choice){ //Switch
	case 1:
	{
		System.out.print("Enter Fahrenhiet :");
		 value=s.nextFloat();
TemperatureEcap obj=new TemperatureEcap(value);
	System.out.println("Temperature(Calcius) : "+obj.getFToC()+" degree");
	}
	break;
	case 2:
	{
		System.out.print("Enter Caclius :");
		 value=s.nextFloat();
TemperatureEcap obj2=new TemperatureEcap(value);
	System.out.println("Temperature(Fahrenheit) : "+obj2.getCToF()+" degree");
	}
	break;
	default:
	System.out.println("Enter a Valid choice");
}
}
}
class TemperatureEcap {

private float c;
private float f ;

public TemperatureEcap(float value){ 
this.c=(value-32.0f)*5/9;
this.f = ((value*1.8f)+32.0f);
}
//Fahrenheit to Celcius Conversion
public float getFToC(){ return this.c; }
//Celcius to Fahrenheit Conversion
public float getCToF(){ return this.f; }
}
