//WAP to show the use of abstract class in java.
import java.lang.*;
import java.util.Scanner;
abstract class base{
    abstract  void get();
    final  static void fun(){
        System.out.println("Static Fun called");
    }
    base(){
        System.out.println("constructor of abstract class called");
    }
}
class box extends base{

    protected int l,w,h;

    void set(int x, int y, int z){
        l=x;w=y;h=z;
    }
    void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
}

class demo{
    public static void main( String args[]){
        box obj=new box();
        obj.set(1,2,3);
        obj.get();
        base.fun();


    }
}
