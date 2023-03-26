//Creating main class  
public class Employee2{  
    //main() method start  
    public static void main(String args[]) {  
          
        //Creating object of EmployeeDetails class  
        EmployeeDetails emp = new EmployeeDetails();  
        //Setting values to the properties  
        emp.setEmp_id(15);  
        emp.setName("Saifullah Khan");  
        emp.setDepartment("Computer Science");  
        emp.setSalary(15000);  
        emp.setAddress("Sukkur");  
        emp.setEmail("ABC@gmail.com");  
          
        //Showing Employee details  
        System.out.println(emp);  
          
        //Getting salary using getter  
        int sal = emp.getSalary();  
        int increment = 0;  
        //Incrementing salary based on condition  
        if ((sal >=1000) && (sal <=1500))  
        {  
            //incrementing salary 2%  
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=1500) && (sal <=20000)){  
            //incrementing salary 5%  
            increment += (sal * 5)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
        }else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp);  
        }         
    }  
}  
class EmployeeDetails {  
    //Creating properties of Employee class  
int emp_id, salary;  
String name, address, department, email;  
  
//Getter and setters for getting and setting properties  
public int getEmp_id() {  
    return emp_id;  
}  
public void setEmp_id(int emp_id) {  
    this.emp_id = emp_id;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getAddress() {  
    return address;  
}  
public void setAddress(String address) {  
    this.address = address;  
}  
public String getDepartment() {  
    return department;  
}  
public void setDepartment(String department) {  
    this.department = department;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
  
//Overriding toString() method  
@Override  
public String toString() {  
    return "Employee details \nemp_id = " + emp_id + "\n salary = " + salary + "\n name = " + name + "\n address = " + address  
            + "\n department = " + department + "\n email = " + email + "";  
    }  
      
}  
