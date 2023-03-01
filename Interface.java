public class Interface implements Real_World{
    
   
    public String username(){
        return "hen";
    }
    
    public String password(){
        return "12345677889";
    }
   
    public String number(){
       
        return "3303333333";
    }
    public int amount(){
        return 10000;
    }
    public String email(){
        return "email@gmail.com";
    }
    public static void main(String[] args) {
        System.out.println("\nReal World Examples\n");
        // 1. Bank
            Interface obj=new Interface();
            
            System.out.println("1. Bank");
            System.out.println("Username:"+obj.username());
            System.out.println("Password:"+obj.password());
               System.out.println("Amount:"+obj.amount());
               System.out.println("Branch:"+obj.branch+"\n");
            // 2.Email-Address
            Interface obj2=new Interface();
            System.out.println("2. Email-Address");
            System.out.println("Username:"+obj2.username());
             System.out.println("Password:"+obj2.password());
              System.out.println("Email:"+obj2.email());
               System.out.println("Number:"+obj2.number());
            //    3. Education
            // Abstract obj3=new Abstraction();
             Interface obj3=new Interface();
             
            System.out.println("\n3. Education");
            System.out.println("Username:"+obj3.username());
             System.out.println("Password:"+obj3.password()+"\n");
    }
    }

interface Real_World{
String branch="Sukkur";
public String username();
public String password();
public String number();
public int amount();
public String email();
} 