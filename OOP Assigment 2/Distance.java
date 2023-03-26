/*Task # 6
Create a distance class. The member data should comprise an int for storing the distance provided, a 
string for choice of the measurement unit and another int for conversion. Member functions should 
allow the user to enter the distance in either of the three units (inches, millimeters, kilometers) and 
convert to the choice of the user and display it
*/
/*
git branch -m main java
git fetch origin
git branch -u origin/java java
git remote set-head origin -a
*/
import java.util.Scanner;
public class Distance {
	public static void main(String args[]){
		Distance obj=new Distance();
		obj.conversion();
		
		
	}
	public void conversion(){
		Scanner s=new Scanner(System.in);
		DataEncap obj=new DataEncap();
		System.out.print("Enter the Distance in meters : ");
		int value=s.nextInt();
		
		obj.setValue(value);
		System.out.println("enter the distance in either of the three units (inches, millimeters, kilometers) example: inches");
		String converter=s.next();
		
		switch(converter){
		case "inches":
		System.out.println("Inches : "+(obj.getValue()/0.0254f));
		break;
		case "millimeters":
		System.out.println("Millimeters : "+(obj.getValue()*1000));
		break;
		case "kilometers":
		System.out.println("Kilometers : "+(obj.getValue()/1000f));
		break;
		default:
		System.out.println("Enter Correct conversion");
		}
		
		
	}
}

class DataEncap {
	private int value;
	
	public void setValue(int value){
		this.value=value;
	}
	
	public int getValue(){
		return this.value;
	}
	
}