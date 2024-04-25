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
public class Employee_Increment {
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




import java.util.Scanner;

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

public class Employee {
      Scanner S1 = new Scanner(System.in);
      public String Employee_First_Name, Employee_Last_Name;
      double Monthly_Salary;

      public Employee(String First_Name, String Last_Name, double Salary)
      {
            this.Employee_First_Name = First_Name;
            this.Employee_Last_Name = Last_Name;
            if(Salary <= 0.)
                  this.Monthly_Salary = 0.;
            else
                  this.Monthly_Salary = Salary;
      }

      public String getEmployee_First_Name() {
            return Employee_First_Name;
      }

      public void setEmployee_First_Name(String employee_First_Name) {
            Employee_First_Name = employee_First_Name;
      }

      public String getEmployee_Last_Name() {
            return Employee_Last_Name;
      }

      public void setEmployee_Last_Name(String employee_Last_Name) {
            Employee_Last_Name = employee_Last_Name;
      }

      public double getMonthly_Salary() {
            return Monthly_Salary;
      }

      public void setMonthly_Salary(double monthly_Salary) {
            if(monthly_Salary <= 0.)
                  this.Monthly_Salary = 0.;
            else
                  this.Monthly_Salary = monthly_Salary;
      }

      public double Incrementor(double Percentage)
      {
            Employee_Test ET1 = new Employee_Test();
            if(ET1.Performace())
            {
                  Monthly_Salary += Percentage * Monthly_Salary / 100;
                  return Monthly_Salary * 12.;
            }
            else
            {
                  System.out.println("No Increment Since not performed well");
                  return Monthly_Salary * 12;
            }
      }

      public double Annual_Salary()
      {
            return Monthly_Salary * 12;
      }

      
}





import java.util.Scanner;

public class Employee_Test {
      Scanner S1 = new Scanner(System.in);
      public String Value;
      public boolean Performace()
      {

            System.out.println("Did you Complete this task within the deadline");
            System.out.println("yes or no");
            Value = S1.nextLine();
            Value = Value.strip().toLowerCase();
            if("yes".equals(Value))
            return true;
            else
            return false;
      }
      public String First_Name()
      {
            System.out.println("Enter your First Name");;
            return S1.nextLine().strip();
      }
      public String Last_Name()
      {
            System.out.println("Enter the Last Name");
            return S1.nextLine().strip();
      }
      public double Get_Salary()
      {
            System.out.println("Enter your Salary");
            return Double.parseDouble(S1.nextLine().strip());
      }
      
}

