// 3 Examples of Association Program 
// 1. (University) == (Faculty)
// 2. (House)      == (Owner)
// 3. (Car)        == (Engine)
import java.util.Scanner;
public class Association {
   public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    // First Example of Association
    University uni=new University();
    //Uni Details
    System.out.println("\n 1st Example of Association");
    System.out.println("\nEmployee Details of "+uni.getUni());
    System.out.print("Enter Name: ");
    String name=s.next();
    System.out.print("Enter Post: ");
    String post=s.next();
    System.out.print("Enter Salary: ");
    int salary=s.nextInt();
    Faculty emp=new Faculty(name,post,salary);
    System.out.println("\n\nDetails are here\n");
    uni.setFaculty(emp);
    System.out.println("Name   : "+uni.getFaculty().getName());
    System.out.println("Post   : "+uni.getFaculty().getPost());
    System.out.println("Salary : "+uni.getFaculty().getSalary());
   
    // 2nd Example of Association
    System.out.println("\n\n2nd Example of Assocation");
    House house=new House();
    System.out.println("Enter the name of owner of "+house.getHousename()+" which is in "+house.getHouselocation());
    System.out.print("Owner Name : ");
    String houseownername=s.next();
    Owner owner=new Owner();
    owner.setOwnerName(houseownername);
    System.out.println("These are the details of House"+houseownername);
    house.setOwner(owner);
    System.out.println(house.getOwner().getOwnerName()+" is the owner of "+house.getHousename()+" which is Located in "+house.getHouselocation());
    // 3rd Example of Association
    System.out.println("\n\n3rd Example of Assocation\n");
     System.out.println("Enter the Name of Car and Its engine model");
     System.out.print("Car Name : ");
     String carname=s.next();
        Car car=new Car(carname);
        System.out.print("Engine Model : ");
    String enginemodel=s.next();
    Engine engine=new Engine();
    engine.setEngineModel(enginemodel);
    car.setEngine(engine);
    System.out.println("Details of Car and Engine Model");
    System.out.println("  Car Name   : "+car.getCarName());
    System.out.println("Engine Model : "+car.getEngine().getEgineModel());
    //Developer Name
    System.out.println("\n =========================================================================");
    System.out.println("Program Developed by Saifullah Khan\n");
   } 
}
//First Example
class Faculty{
private String name;
private String post;
private int salary;
public Faculty(String name,String post,int salary){
    this.name=name;
    this.post=post;
    this.salary=salary;
}
public String getName(){
    return this.name;
}
public int getSalary(){
    return this.salary;
}
public String getPost(){
    return this.post;
}
}
class University{
private String Uniname;
private Faculty faculty;
University(){
   this.Uniname="Mehran University";
}
public String getUni(){
    return this.Uniname;
}

public void setFaculty(Faculty faculty){
    this.faculty=faculty;
}
public Faculty getFaculty(){
    return faculty;
}
}
//2nd Example of Association
class Owner{
    private String ownerName;
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
}
class House{
   private String housename;
   private String houselocation;
   private Owner owner;
   House() {
    this.housename="Zaman Park";
    this.houselocation="Lahore";
   }
   public String getHousename(){
    return this.housename;
   }
   public String getHouselocation(){
    return this.houselocation;
   }
   public void setOwner(Owner owner){
    this.owner=owner;
   }
   public Owner getOwner(){
    return this.owner;
   }
}
//3rd Example of Association
class Engine{
    private String enginemodel;
    public void setEngineModel(String enginemodel){
        this.enginemodel=enginemodel;
    }
    public String getEgineModel(){
        return this.enginemodel;
    }
}
class Car{
    private String Carname;
    private Engine engine;
    Car(String Carname){
        this.Carname=Carname;
    }
    public String getCarName(){
        return this.Carname;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public Engine getEngine(){
        return this.engine;
    }
}