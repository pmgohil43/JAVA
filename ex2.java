/*
	WAP to calculate simple interest.
*/
import java.util.Scanner;
public class ex2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		float p,r,tot;
		System.out.println("Enter a amount : ");
		n = sc.nextInt();
		System.out.println("Enter a reat of amount : ");
		p = sc.nextFloat();
		System.out.println("Enter a year of amount : ");
		r = sc.nextFloat();
		tot = (p*r*n)/100;
		System.out.println("Your simple interest is : "+tot);		
	}
}
