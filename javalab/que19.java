class gen<T>{
	T obj1,obj2;
	gen(T po1,T po2){
		obj1 = po1;
		obj2 = po2;
	}
	public void get(){
		System.out.println(obj1+" "+obj2);
	}
}
class demo{
	public static void main(String args[]){	
		gen<Integer> ob1 = new gen<Integer>(1,2);
		ob1.get();
		gen<String> ob2 = new gen<String>("Mehul","Basera");
		ob2.get();
	}
}