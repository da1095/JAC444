/**********************************************
Workshop #3
Course:<subject type> - JAC444
Last Name:<Ahir Ahir>
First Name:< Devang >
ID:<153484209>
Section:<NCC>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<submission date>
**********************************************/


package task2;
import java.util.Scanner;


public class TestClass {
    public static void main(String[] args) throws TriangleException{
    Scanner scanner=new Scanner(System.in);    
    System.out.println("Enter tringle side1:");
    double side1=scanner.nextDouble();
    System.out.println("Enter tringle side2:");
     double side2=scanner.nextDouble();
    
    System.out.println("Enter tringle side3:");
     double side3=scanner.nextDouble();
    
    System.out.println("Enter tringle is filled ,true or false:");
     boolean fill=scanner.nextBoolean();
    System.out.println("Enter tringle color:");
     String color=scanner.next();
    Triangle t=new Triangle(side1,side2,side3,color,fill);
    System.out.println(t.toString());
    
    }
}
