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

public abstract class car {
      Scanner S1 = new Scanner(System.in);
      int speed;
      double regularPrice;
      String colour;
      
      public car(int speed, double regularPrice, String colour)
      {
            if(speed > 0)
            this.speed = speed;
            else
            this.speed = 0;
            if(regularPrice > 0)
            this.regularPrice = regularPrice;
            else
            this.regularPrice = regularPrice;
            this.colour = colour;
      }

      public car() 
      {
            speed = 0;
            regularPrice = 0;
            colour = "";
      }

      public int getSpeed() 
      {

            return speed;
      }

      public void setSpeed() 
      {
            System.out.println("Enter the speed");
            int speed = Integer.parseInt(S1.nextLine());
            if(speed > 0)
                  this.speed = speed;
            else
                  this.speed = 0;
      }

      public double getRegularPrice() 
      {
            return regularPrice;
      }

      public void setRegularPrice() 
      {
            System.out.println("Enter the price");
            double regularPrice = Double.parseDouble(S1.nextLine());
            if(regularPrice > 0)
                  this.regularPrice = regularPrice;
            else
                  this.regularPrice = 0;
      }

      public String getColour() 
      {
            return colour;
      }

      public void setColour() 
      {
            System.out.println("Enter the colour");
            this.colour = S1.nextLine();
      }

      public abstract double getSalePrice();


}
