// public class Area {
//     int length;
//     int breadth;

//     // We create a constructor
//     // constructor is also a function whose name is same as CLASS with no return type

//     Area(int l, int b){
//         length = l;
//         breadth = b;
//     }

//     public double calculateArea(){
//         return length * breadth;
//     }

//     public int calculatePerimeter(){
//         return length + length + breadth + breadth;
//     }

//     public static void main(String args[]){

//        Area shape1 = new Area(2, 4); // creating object
//        double a1 = shape1.calculateArea();
//        int p1 = shape1.calculatePerimeter();
//        System.out.println("SHAPE1: Area is: "+ a1+" Perimiter is: "+ p1);

//        Area shape2 = new Area(100, 10); // creating object
//        double a2 = shape2.calculateArea();
//        int p2 = shape2.calculatePerimeter();
//        System.out.println("SHAPE2: Area is: "+ a2+" Perimiter is: "+ p2);
//     }

// }



// create class employee that has 3 fields employee id and employee name and employee depart ment
//create a construitor that accepts abouve three parametres and sets them 
// create a function that returns emplopyee name 
//create one more function that resturns employee id and department.
//write main function and  create 5 employess.


// Problem 1: Create a class Average, that has 3 numbers of type double, set the data in constructor//
// and write a method calculateAverage() that calculates are returns the average//



public class Average {
   double gst;
   double gst1;

   Average(double gst, double gst1){

   this.gst = gst;
    this.gst1 = gst1;

   }
   
   public double calculateAverage(){
    return (gst1 + gst) / 2 ;
}

public static void main(String args[]){

          Average A1 = new Average(99.0099, 099.09);
          double A2 = A1.calculateAverage();
          System.out.println(A2);


}

}


