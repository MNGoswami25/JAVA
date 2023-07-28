//8.  WAP to show function overriding in java.
import java.lang.*;
import java.util.Scanner;
// class Box{
//     protected int l,w,h;
//     public void setInfo(int x,int y,int z){
//         l=x;
//         w=y;
//         z=h;
//     }
//     public void getInfo(){
//         System.out.println("Length: "+l);
//         System.out.println("Width: "+w);
//         System.out.println("height: "+h);
//     }
//     public void volume(){
//         System.out.println("Volume: "+(l*w*h));

//     }
// };
// class sample1 extends Box{
//     protected int wt;
//         public void setInfo(int x,int y,int z,int m){
//             l=x;
//             w=y;
//             h=z;
//             wt=m;
//         }
//         public void getInfo(){
//             System.out.println("Length: "+l);
//             System.out.println("Width: "+w);
//             System.out.println("height: "+h);
//             System.out.println("weight: "+wt);
//         }
//         public void density(){
//             System.out.println("Density: "+(wt/(l*w*h)));
//         }
// };
// class sample2 extends sample1{
//     private String color;
//     public void setInfo(int x,int y,int z,int m,String n){
//         l=x;
//         w=y;
//         h=z;
//         wt=m;
//         color=n;
//     }
//     public void getInfo(){
//         System.out.println("Length: "+l);
//         System.out.println("Width: "+w);
//         System.out.println("height: "+h);
//         System.out.println("weight: "+wt);
//         System.out.println("color: "+color);
//     }

// };
// class demo{
//     public static void main(String arg[]){
//         Box b=new Box();
//         sample1 s1=new sample1();
//         sample2 s2=new sample2();
//         Box ref;
		
// 		ref=s2;
// 		ref.setInfo(1,2,3);
// 		ref.getInfo();

//     }
// }
class Animal {
      void makeSound() {
      System.out.println("The animal makes a sound");
    }
  };
  
  class Cat extends Animal {
      void makeSound() {
      System.out.println("Meow");
    }
  }
  
 class demo {
    public static void main(String[] args) {
      Animal animal = new Animal();
      animal.makeSound(); // prints "The animal makes a sound"
      
      Cat cat = new Cat();
      cat.makeSound(); // prints "Meow"
    }
  }
  
