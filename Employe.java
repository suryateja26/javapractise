import java.io.ObjectInputStream.GetField;

import javax.xml.namespace.QName;

public class Employe {

int Employeid;
String EmployeName;
String Employedepartment;

Employe(int id, String name, String dp){    //creating constructor

    Employeid = id;
    EmployeName = name;
    Employedepartment = dp;
}

public String getid(){   //creating a function
    return EmployeName;
}

public String getnameanddp(){     //creating a function
    return "Emp id: " + Employeid + " DEPT: "+ Employedepartment;
}


public static void main(String args[]) {

    Employe employe1 = new Employe(10,"surya","it");  // creating a object
    String e = employe1.getid();
    String e1 = employe1.getnameanddp();
    System.out.println("employe1: employe id is: "+ e+" getnameanddp is: "+e1);  //"SHAPE2: Area is: "+ a2+" Perimiter is: "+ p2
    
    Employe employe2 = new Employe(20,"raghu","accounts");  // creating a object
    String dp = employe2.getid();
    String dp1 = employe2.getnameanddp();
    System.out.println("employe2: employe id is: "+ dp+" getnameanddp is: "+dp1);

    Employe employe3 = new Employe(200,"ram","cloud");  // creating a object
    String gt = employe3.getid();
    String gt1 = employe3.getnameanddp();
    System.out.println("employe3: employe id is: "+ gt+" getnameanddp is: "+gt1);

    Employe employe4 = new Employe(2,"GST","SEO");  // creating a object
    String st = employe4.getid();
    String st1 = employe4.getnameanddp();
    System.out.println("employe4: employe id is: "+ st+" getnameanddp is: "+st1);


    Employe employe5 = new Employe(22,"rocky","QA");
    String gyt = employe5.getid();
    String gytz = employe5.getnameanddp();
    System.out.println("employe5: emplpoye id is: "+ gyt+" getnameanddp os: "+gytz);

    Employe employe0 = new Employe(3, "gsurya", "dev");
   String gst = employe0.getid();
   String gst1 = employe0.getnameanddp();
   System.out.println("employe0: employe id is: "+ gst+ " getnameanddp is : "+gst1);

   Employe emplpoye007 = new Employe(007, "god", "ceo");
   String f = emplpoye007.getid();
   String f1 = emplpoye007.getnameanddp();
   System.out.println("emplpoye007: employe id is "+ f +"getnameadndp is :"+f1);



}

}