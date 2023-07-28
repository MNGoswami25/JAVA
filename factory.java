import java.lang.System;
import java.util.Scanner;
 interface Shape {
    void draw();
 }
 
 class Circle implements Shape {
    @Override
    public void draw() {
       System.out.println("Drawing Circle");
    }
 }
 
 class Rectangle implements Shape {
    @Override
    public void draw() {
       System.out.println("Drawing Rectangle");
    }
 }
 
 class Square implements Shape {
    @Override
    public void draw() {
       System.out.println("Drawing Square");
    }
 }
 
 class ShapeFactory {
    public static Shape createShape(String shapeType) {
       if (shapeType.equalsIgnoreCase("CIRCLE")) {
          return new Circle();
       } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
          return new Rectangle();
       } else if (shapeType.equalsIgnoreCase("SQUARE")) {
          return new Square();
       }
       return null;
    }
 }
 
 class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String s=sc.nextLine();
       Shape shape1 = ShapeFactory.createShape(s);
       shape1.draw();
    }
 }
  

//  import java.lang.*;
//  import java.util.Scanner;
//  interface Bank{
     
//      void name();
//      float rateOfInterest();  
//      }  
     
//  class SBI implements Bank{  
//      public void name(){System.out.println("State Bank of India");}
//      public float rateOfInterest(){return 9.15f;}  
//  }  
//  class PNB implements Bank{  
//      public void name(){System.out.println("Punjab National Bank");}
//      public float rateOfInterest(){return 9.7f;}  
//  } 
//  //factor method
//  class callBank {//intence=object//equalsIgnoreCase=string comparision
//      public static Bank tellBank(String s) {
//         if (s.equalsIgnoreCase("SBI")) {
//            return new SBI();
//         } else if (s.equalsIgnoreCase("PNB")) {
//            return new PNB();
//         }
//         return null;
//      }
//   } 
//  class TestInterface2{  //int x=Fun()
//      public static void main(String[] args){  
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter Bank: ");
//          String s=sc.nextLine();
//          Bank b = callBank.tellBank(s);//new SBI();//new pnb();
//          b.name();
//          System.out.println("ROI: "+b.rateOfInterest());  
//      }
//  }  