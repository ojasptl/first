package Employee_Test;
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
