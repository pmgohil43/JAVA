/*
	A shop offers a discount of 25% on the purchase made by the customer. the bill amount
	of a customer is Rs. 2500. write a program to calculate discount and amount after
	discount, display bill amount, discount and amount after discount.
*/
import java.util.Scanner;
public class ex5{
	public static void main(String[] args){
		System.out.println("Enter a amount and check discount able or not : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==2500)
		{
			System.out.println("Not able for the discount...^_^"); 
			System.out.println("Without Discount : "+a);
			int disc = a * 25 / 100;
			System.out.println("Discount : "+disc);
			int tot = a - disc;
			System.out.println("With Discount : "+tot);
		}
		else
		{
			System.out.println("Not able for the discount...^_^");
			System.out.println("Without Discount : "+a);
			System.out.println("Discount : 0");
			System.out.println("With Discount : "+a);
		}
	}
}