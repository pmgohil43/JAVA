/*
	WAP a program to convert the amount from US$ to Indian Rupee.
*/
import java.util.Scanner;
public class ex8{
	public static void main(String[] args){
		System.out.println("Enter a amount in US$ : ");
		double inr;
		int us;
		Scanner sc = new Scanner(System.in);
		us = sc.nextInt();
		inr = us*75;
		System.out.println("USD to INR : "+ inr);
	}
}