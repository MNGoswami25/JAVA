import java.lang.*;
import java.util.Scanner;
interface A{  
    void a();  
    void b();  
    void c();  
    }  
      
    abstract class B implements A{  //a b,c
        public void c(){System.out.println("I am c");}  
        //a(),b()
    }  
          
   abstract class M extends B{  //a,b,c
        
        public void a(){System.out.println("I am a");} 
        public void b(){System.out.println("I am b");} 
        
    }  
    
      
    class Test5{  
    public static void main(String args[]){  
    A a=new M();  
    a.a();  
    a.c();   
    //a.bc3(); error 
    }} 