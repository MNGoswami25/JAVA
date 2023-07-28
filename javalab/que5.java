import java.lang.*;
import java.util.Scanner;
class funOverloading{
    static void add(int x,int y){
        System.out.println("sum: "+(x+y));

    }
    static void add(int x,int y,int z){
        System.out.println("sum: "+(x+y+z));

    }
    public static void main(String arg[]){
        System.out.println("Press 1 to add 2 numbers else 0 to add 3 numbers");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println("Enete numbers: ");
        if (c==1){
            int x=sc.nextInt();
            int y=sc.nextInt();
            add(x,y);
        }
        else{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            add(x,y,z);
        }
    }
}
