/*
	WAP a program to convert fahrenheit temperature to centigrade equivalent
*/
import java.util.Scanner;
public class ex6{
	public static void main(String[] args){
		System.out.println("Enter a Fahrenheit : ");
		Scanner sc = new Scanner(System.in);
		//fahrenheit = f , centigrade = c
		float f, c;
		f = sc.nextInt();
		c = ((f-32)*5)/9;//f=50, 50-32=18, 18*5=90, 90/9=10;
		System.out.println("Centigrade is : "+ c);
	}
}