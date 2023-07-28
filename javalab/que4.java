//WAP to show the use of class, object and constructor in java. Create a box class with variables length, width, height and functions set(), get(), volume().
import java.lang.*;
import java.util.Scanner;
class box{
    private int l,w,h;   
    box(int x,int y,int z){
            l=x;
            w=y;
            h=z;
        }
        void set(int x, int y, int z){
            l=x;
            w=y;
            h=z;
        }
        void get(){
            System.out.println(l);
            System.out.println(w);
            System.out.println(h);
        }
        
        void vol(){
            System.out.println(l*w*h);	
        }
    }
    
    class demobox{
        public static void main(String ar[]){
            
            box obj1;
            obj1=new box(10,20,30);
            System.out.println("Press 1 if you want to set new dimention to the box(rather than 10,20,30)else press 0");
            Scanner sc=new Scanner(System.in);
            int c=sc.nextInt();
            if(c==1){
                System.out.println("Enter Dimensions");
                int x=sc.nextInt();
                int y=sc.nextInt();
                int z=sc.nextInt();
                obj1.set(x,y,z);
            }
            obj1.get();
            obj1.vol();
            
            
        }
    }
    