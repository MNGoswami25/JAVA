//java exception handling 

import java.lang.*;
import java.util.Scanner;

class test{
    public static void main(String arg[]){
        int a,b;
        int arr[]={10,20};
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
           
            System.out.println(a/b);
            if(b==1){
                throw new ArithmeticException("Divide by 1");
            }
             arr[a]=100;
        }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by Zero"+e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(("Array index out of bond" + e));
        // }
        catch(Exception e){
            System.out.println(e.getMessage());        }
    }
}