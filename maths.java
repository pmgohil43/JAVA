/*
	write a program to get two values from user and one oparator from user perform action baised on oparator 
	for that create one function name with arithmatic.
*/
import java.util.*;
class arithmatic{
	void arithmatic(){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a any sign for arithmatic calculation : ");
		String s = sc.next();
	
		System.out.println("Enter a two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
	
		switch(s){
			case "+":
				c = a + b;
				System.out.println("Addition : "+ c);
				break;
			case "-":
				c = a - b;
				System.out.println("Subtraction : "+ c);
				break;
			case "*":
				c = a * b;
				System.out.println("Multiplication : "+ c);
				break;
			case "/":
				c = a / b;
				System.out.println("Division : "+ c);
				break;
			default:
				System.out.println("Pleas, Enter a valid sign..!");
				break;
		}
	}
}
public class maths{
	public static void main(String args[]){
		arithmatic arith = new arithmatic();
		arith.arithmatic();
	}
}