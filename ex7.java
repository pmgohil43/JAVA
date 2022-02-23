/*
	WAP to convert the length from inches to centimeters
	1 inche = 2.54
*/
import java.util.Scanner;
public class ex7{
	public static void main(String[] args){
		double  i, cm, c = 2.54;
		System.out.println("Enter a inche : ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		cm = i*c;
		System.out.println("Inches to Centimeters : " + cm);
	}
}
