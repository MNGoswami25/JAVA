// //WAP to show the use of interface in java.
// import java.lang.*;
// import java.util.Scanner;
// interface Bank{
    
//     void name();
//     float rateOfInterest();  
//     }  
    
// class SBI implements Bank{  
//     public void name(){System.out.println("State Bank of India");}
//     public float rateOfInterest(){return 9.15f;}  
// }  
// class PNB implements Bank{  
//     public void name(){System.out.println("Punjab National Bank");}
//     public float rateOfInterest(){return 9.7f;}  
// }  
// class TestInterface2{  
//     public static void main(String[] args){  
//     Bank b=new SBI();  
//     b.name();
//     System.out.println("ROI: "+b.rateOfInterest());  
  
//     }
// }  

//multiple inheritence using interface

interface  A{
        void get();
}
interface B extends A{
    void print();
}
interface C extends A{
    void disp();
}
interface D extends B ,C{
    void all();
}
class imp implements D{
    public void get(){
        System.out.println("Hello");
    }
    public void print (){
        System.out.println("Hello");
    }
    public void disp (){
        System.out.println("Hello");
    }
    public void all (){
        System.out.println("Hello");
    }
}

class test{
    public static void main(String[] args) {
        imp obj=new imp();
        obj.all();
        obj.disp();
        obj.get();
        obj.print();
    }
}