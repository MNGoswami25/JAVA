//WAP to show the use of Scanner class to take input from user. Use Scanner class to take one int, one char and one line as input from user and print the output
import java.lang.*;
import java.util.Scanner;
class Test{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details of a Student (Name ,Rollno,section)");
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Rollno: ");
        int x=sc.nextInt();
        System.out.print("Enter Section: ");
        char c=sc.next().charAt(0);
        System.out.println("Details are");
        System.out.println("Name: "+" "+name+"  "+"Rollno: "+x +" "+"Section: "+c);
    }
    
  
}