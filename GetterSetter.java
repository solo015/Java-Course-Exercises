import java.util.Scanner;

public class GetterSetter {
    
   
    public static void main(String cap[]){
        Encapsulation Encap=new Encapsulation();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Id and Name");
        int    id=s.nextInt();
        String name=s.next();
        Encap.showDetails(id,name);
        Encap.getDetails();
      
    

    }
}
class Encapsulation{
    private String name;
    private int id;
    public void getDetails(){
        
        System.out.println("\n  Id : "+this.id);
         System.out.println("Name : "+this.name);
    }
 
    public void showDetails(int id,String name){
        this.id=id;
        this.name=name;
    }
   
}
