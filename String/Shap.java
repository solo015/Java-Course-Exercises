/*
 Define an interface Shape and print a line with a specific character below a text. 
Here void printLine(String s)is to declared in Shape and to be 
implemented by different class. 

 */
public class Shap{
    public static void main(String[] args) {
        Square obj1=new Square();
        Circle obj2=new Circle();
        Rectangle obj3=new Rectangle();
        System.out.println("Square : "+obj1.area());
        System.out.println("Circle : "+ obj2.area());
        System.out.println("Rectangle : "+ obj3.area());
        System.out.println("==============================================");
        System.out.println("Programmed By Saifullah Khan");
    }
}
//Interface
interface Shape {
    public double area(); 
}
class Square implements Shape{

    @Override
    public double area(){
        double area=4*4*4;
        return area;

    }
}
 class Circle implements Shape{
  
    @Override
    public double area(){
        double area=4*4*4;
        return area;

    }
}

class Rectangle implements Shape {
    @Override
    public double area(){
        double area=4*4*4;
        return area;

    }
   
}

