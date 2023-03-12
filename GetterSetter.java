import java.util.Scanner;

public class GetterSetter {
    
   
    public static void main(String cap[]){
        
        Encapsulation Encap=new Encapsulation();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Id and Name");
        int    id=s.nextInt();
        String name=s.next();
        
         Encap.setId(id);
         Encap.setName(name);
        System.out.println("\n   Id : "+Encap.getId());
        System.out.println("\n  Name : "+Encap.getName());
      
    

    }
}
class Encapsulation{
    private String name;
    private int id;
    public int setId(){
        return this.id;
    }
  public String setId(){
        return this.name;
    }
    public void getId(int id){
        this.id=id;
       
    }
     public void getName(String name){
        
        this.name=name;
    }
   
}
