/* 	write a program to create last name with sybsc create a function same as class name and also create 
	constructor which is call a static method named as run method 
*/
class sybsc{
		
	static void runmethod(){
		System.out.println("sybsc function");
		//sybsc();
	}
	sybsc(){
		System.out.println("basic");
		sybsc();
	}
	void sybsc(){
		System.out.println("1");
		runmethod();
	}
}
public class staticCall{
	public static void main(String args[]){
		sybsc sb = new sybsc();
	}
}