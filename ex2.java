import java.util.*;
public class ex2{
	// prn/100
	public static void main(String[] args){
		System.out.println("Enter a price, rate, time(in year) : ");
		Scanner sc = new Scanner(System.in);
		int p, n;
		float r, tot;
		p=sc.nextInt();
		r=sc.nextFloat();
		n=sc.nextInt();
		
		tot = (p*r*n)/100;
		System.out.println("Your Intrest is : "+tot);
		
	}
}