// import java.util.Scanner;
// import java.lang.*;


// class useOfStatic{
//     private static String clg="Graphic Era Hill University";
//     private String name;
//     private int rollno;
   
//     void getInfo(Scanner s){
//         System.out.print("Enter name: ");
//         name=s.nextLine();
//         System.out.print("Enter Rollno: ");
//         rollno=s.nextInt();
     
//     }
    
//     void displayInfo(){
//         System.out.println("Collage: "+clg);
//         System.out.println("Name: "+name);
//         System.out.println("Roll no : "+rollno);
//     }
    
//     public static void main(String arg[]){
//         System.out.println("Enter Details of Student of GEHU ");
//         System.out.print("Enter No of Students: ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.nextLine(); // consume the newline character left by nextInt()
//         useOfStatic[] ob=new useOfStatic[n];
//         for(int i=0;i<n;i++){
//             ob[i] = new useOfStatic();
//             System.out.println("Enter Details of student " + (i+1));
//             ob[i].getInfo(sc); // pass the scanner object as argument
//             sc.nextLine();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(" Details of student " + (i+1));
//             ob[i].displayInfo();
//         }
//         System.out.println("Press 1 if you want to change the collage name of Students");
//         int m=sc.nextInt();
//         if(m==1){
//             System.out.print("Enter collage name: ");
//             sc.nextLine();
//             clg=sc.nextLine();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(" Details of student " + (i+1));
//             ob[i].displayInfo();
//         }

//         sc.close(); // close the scanner object
//     }
// }
import java.util.Scanner;
import java.lang.*;


class useOfStatic{
    private static String clg="Graphic Era Hill University";
    private String name;
    private int rollno;
   
    void getInfo(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=s.nextLine();
        System.out.print("Enter Rollno: ");
        rollno=s.nextInt();
     
    }
    
    void displayInfo(){
        System.out.println("Collage: "+clg);
        System.out.println("Name: "+name);
        System.out.println("Roll no : "+rollno);
    }
    
    public static void main(String arg[]){
        useOfStatic stu1=new useOfStatic();
        useOfStatic stu2= new useOfStatic();
        System.out.println("Enter Details of Student 1 ");
        stu1.getInfo();
        System.out.println(" Details of student 1");
        stu1.displayInfo();
        System.out.println("Enter Details of Student 2 ");
        stu1.getInfo();
        System.out.println(" Details of student 2");
        stu1.displayInfo();
    }
}
