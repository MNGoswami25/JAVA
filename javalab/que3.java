//WAP to create and use function in java. Create an add function to add two variables and print them.
// import java.lang.*;
// import java.util.Scanner;
// class Function{
//     void add(int x,int y){
//         int sum=x+y;
//         System.out.println("Addition of two numbers is : "+ sum);
//     }
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter two numbers");
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         Function ob=new Function();
//         ob.add(x,y);
//     }
    
// }
import java.lang.*;
import java.util.Scanner;
class demoadd{
        static void add(int x, int y){ //it should be static and inside demo class
		System.out.println("The sum is "+ (x+y));
	}
	public static void main(String ar[]){
			
		int a,b;
		Scanner scobj=new Scanner(System.in);

		a=scobj.nextInt();
		b=scobj.nextInt();
		add(a,b);
	}
}
