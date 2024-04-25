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
public class Car_Ford_Truck_Sedan {
     
    public static void main(String[] args) throws Exception {
      Scanner S1 = new Scanner(System.in);
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

public abstract class Car_Ford_Truck_Sedan {
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

 public class Ford extends Car_Ford_Truck_Sedan{

    int year;
    int manufacturerDiscount;

    public int year()
    {
          System.out.println("Enter the year of production of the Ford");
          return Integer.parseInt(S1.nextLine());
    }
    
    public double getManufacturerDiscount()
    {
          System.out.println("Enter the manufacture discount of the Ford");
          return Double.parseDouble(S1.nextLine());
    }

    @Override
    public double getSalePrice()
    {
          return (super.getRegularPrice() - getManufacturerDiscount());
    }
}


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

 public class Sedan extends Car_Ford_Truck_Sedan{


    public int getLength()
    {
          System.out.println("Enter the length of the car");
          return Integer.parseInt(S1.nextLine());
    }

    @Override

    public double getSalePrice()
    {
          if(getLength() >= 20)
          return super.getRegularPrice() * 0.95;
          else
          return super.getRegularPrice() * 0.90;
    }
    
}


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

 public class Truck extends Car_Ford_Truck_Sedan{

    public double Weight()
    {
          System.out.println("Enter the Weight");
          return Double.parseDouble(S1.nextLine());
    }
    @Override
    public double getSalePrice()
    {
          if(Weight() > 2000.)
          return super.getRegularPrice() * .9;
          else
          return super.getRegularPrice() * .8;
    }
    
}
