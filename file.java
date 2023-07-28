import java.io.*;

class demo{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		String s="manoj Nath\nPooja Joshi";
		FileOutputStream fout=new FileOutputStream("test.txt");
		for(int i=0;i<s.length();i++){
			fout.write(s.charAt(i));
		}
		fout.close();
		FileInputStream fin=new FileInputStream("test.txt");
		int c=0,l=1,w=0,ch=0;
		while ((c = fin.read())!= -1){
			
		    System.out.println((char)c);
        }
		fin.close();

	}
	
}
