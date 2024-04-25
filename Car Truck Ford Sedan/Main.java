/*
Create a super class called Car. The Car class has the following fields and methods. ◦int
speed; ◦double regularPrice; ◦String color; ◦double getSalePrice();
a. Create a sub class of Car class and name it as Truck. The Truck class has the
following fields and methods. ◦int weight;
◦doublegetSalePrice();//Ifweight&gt;2000,10%discount.Otherwise,20%discount
b. Create a subclass of Car class and name it as Ford. The Ford class has the
following fields and methods ◦int year; ◦int manufacturerDiscount;
◦doublegetSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanuf
acturerDiscount.
c. Create a subclass of Car class and name it as Sedan. The Sedan class has the
following fields and methods. ◦int length;
◦doublegetSalePrice();//Iflength&gt;20feet,5%discount,Otherwise,10%discount.
 */
import java.util.Scanner;
public class Main {
    static Scanner S1 = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("What car do you want to buy");
        System.out.println("Truck, Ford or Sedan");
        String choice = S1.nextLine();
        if(choice.strip().toLowerCase().equals("truck"))
        {
            Truck T1 = new Truck();
            T1.setColour();
            T1.setSpeed();
            T1.setRegularPrice();
            System.out.println("The sale price of truck is");
            System.out.println(T1.getSalePrice());
            return;
        }
        if(choice.strip().toLowerCase().equals("ford"))
        {
            Ford T1 = new Ford();
            T1.setColour();
            T1.setSpeed();
            T1.setRegularPrice();
            T1.year();
            System.out.println("The sale price of ford is");
            System.out.println(T1.getSalePrice());
            return;
        }
        if(choice.strip().toLowerCase().equals("sedan"))
        {
            Sedan T1 = new Sedan();
            T1.setColour();
            T1.setSpeed();
            T1.setRegularPrice();
            System.out.println("The sale price of truck is");
            System.out.println(T1.getSalePrice());
            return;
        }
        else
        {
            System.out.println("exiting");
            return;
        }
    }
}
