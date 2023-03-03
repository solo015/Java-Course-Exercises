// Three real life examples of Abstraction
// 1. Bank: When we go to ATM machine it asks about you password, and asks you about your need of amount to cashout
// 2. Email-address: When we  go to login any app like facebook, google playstore, etch, each time it ask to user his/her 
//    email-address/username/number+password.
// 3. eduation: when teachers go to attendence form they enter their username, and password given from the institute(MUET)
// 1. Bank

public class Abstraction extends Abstractblank{
    @Override
    public String username(){
        return "hen";
    }
     @Override
    public String password(){
        return "12345677889";
    }
    @Override
    public String number(){
       
        return "3303333333";
    }
     @Override
    public int amount(){
        return 10000;
    }
     @Override
    public String email(){
        return "email@gmail.com";
    }
    
public static void main(String[] args) {
    
        System.out.println("\nReal World Examples\n");
    // 1. Bank
        Abstraction obj=new Abstraction();
        
        System.out.println("1. Bank");
        System.out.println("Username:"+obj.username());
        System.out.println("Password:"+obj.password());
           System.out.println("Amount:"+obj.amount()+"\n");
        // 2.Email-Address
        Abstraction obj2=new Abstraction();
        System.out.println("2. Email-Address\n");
        System.out.println("Username:"+obj2.username());
         System.out.println("Password:"+obj2.password());
         System.out.println("Email:"+obj2.email());
         System.out.println("Number:"+obj2.number());
        //    3. Education
        // Abstract obj3=new Abstraction();
         Abstraction obj3=new Abstraction();
         
        System.out.println("\n3. Education");
        System.out.println("Username:"+obj3.username());
         System.out.println("Password:"+obj3.password()+"\n");
}
}
abstract class Abstractblank{
    abstract String username();
    abstract String password();
    abstract int amount();
    abstract String number();
    abstract String email();
}
