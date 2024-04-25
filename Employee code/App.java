/*
 Create a class called Employee that includes three pieces of information as instance
variables—a first name (type String), a last name (type String) and a monthly salary
(double). Your class should have a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable. If the monthly salary is not
positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s
yearly salary. Then give each Employee a 15% raise and display each Employee’s yearly
salary again.
 */
import Employee_Test.Employee_Test;
import Employee.Employee;
public class App {
    public static void main(String[] args) throws Exception {
        Employee_Test ET1 = new Employee_Test();
        Employee E1 = new Employee(ET1.First_Name(), ET1.Last_Name(), ET1.Get_Salary());
        Employee E2 = new Employee(ET1.First_Name(), ET1.Last_Name(), ET1.Get_Salary());
        
        System.out.println("Salary before incrementing");

        System.out.println(E1.Annual_Salary());
        System.out.println(E2.Annual_Salary());

        System.out.println("Salary After Incrementing");
        
        System.out.println(E1.Incrementor(15));
        System.out.println(E2.Incrementor(15));
    }
}
