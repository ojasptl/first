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

public class Truck extends car{

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
