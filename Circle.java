// Problem 2: Create a class Circle, that has 2 private data members, double radius and String color, set the data in constructor and
//  create a public method calcArea that calculates are returns the area, and
//   another public  method getColor that prints the color.


public class Circle {

    private double radius;
    private String color;

     Circle (double r, String c) {

        radius = r ;
        color = c;
     }
     public double calcArea() {
        return Math.PI * radius * radius;
    }

    public String getcolor(){
        return color;
     }

public static void main(String[] args) {
    Circle circle1 = new Circle(98, "red");
        double d1 = circle1.calcArea();
        String s1 = circle1.getcolor();
        System.out.println("circle1: getarea is  "+ d1 +" getcolor is : "+s1);

     }

    }

     
    
// }


// Create a class InvoiceItem, that has invoiceId, itemName, qty, unitPrice. Set the data in constructor,
//  and write methods to getId, getQty, getUnitPrice, getTotalPrice, etc. 
//  Keep the data members private and methods public. 

