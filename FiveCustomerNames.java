import java.util.Scanner;

public class FiveCustomerNames{
    
   
    public static void main(String cap[]){
        Encapsulation Encap=new Encapsulation();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the details 5 Customers :");
        for(int i=1; i<=5; i++){
           System.out.println("Enter Id and Name");
           Encap.showDetails(s.nextInt(),s.next());
       }
       System.out.println("\nId and Name of All Customers:f");
        Encap.getDetails();
    
    }
}
class Encapsulation{
    private String[] name=new String[5];
    private int id[]=new int[5];
    private int counter=0;
    public void getDetails(){
        for(int i=0; i<5; i++){
            System.out.println("\n  Id : "+this.id[i]);
             System.out.println("Name : "+this.name[i]);

        }
    }
 
    public void showDetails(int id,String name){

        this.id[counter]=id;
        this.name[counter]=name;
        counter++;
    }
   
}
