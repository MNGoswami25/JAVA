//WAP to show the use of super keyword in java.
import java.lang.*;
class Animal{
    String color="Black";
    void work(){
        System.out.println("Eating");
        System.out.println("Sleeping");
        System.out.println("Wander");
    }
}
class dog extends Animal{
   String color="Red";
    void basic(){
        System.out.println("Basic color is"+super.color);
        System.out.println("Its Color is : "+color);
    }
    void work(){
        System.out.println("Basic works are");
        super.work();
        System.out.println("Home Guard");
    }
    void sound(){
        System.out.println("Barking");
    }

}
class testSuper{
    public static void main(String arg[]){
        dog d=new dog();
        d.basic();
        d.work();
        d.sound();
    }
}