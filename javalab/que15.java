 import java.util.Scanner;
class demo{

	public static void fun(int x)
	throws IllegalAccessException{
		if(x==0){
			throw new ArithmeticException("msg");
		}
		if(x==1){
			throw new IllegalAccessException("msg");
		}

	}
	public static void main(String args[]){

		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();	
		try{
			fun(a);
		}
		
		catch(ArithmeticException e){
			System.out.println("arithmetic exception caught");
		}
		
		catch(IllegalAccessException e){
			System.out.println("Illegal access exception caught");
		}
	}
}
