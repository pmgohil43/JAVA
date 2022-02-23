/*
	WAP a program a to get three numbers from the user perform following action on them 
	1. pelindrom
	2. fibonacey
	3. do sum of number 1 and number 2 store it into another variable also do sum of number 2 and number 3 and
		also sum of number 1 and number 3 now check which answer is large and print it.
	4. find the square root of all the number and do sum of them now check which number 3 is largest or smallest.
	5. do all the numbers of sum and find the square root after check number is armstroge or not if number is 
		armstroge then find power of that number otherwise print sequence of that number until 20.
*/
import java.util.*;
class a{
	public int n1,n2,n3;
	Scanner sc = new Scanner(System.in);	
	void pelindrom(){
		System.out.print("Enter a 3 number : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
/*		
		int sum=0;
		int tot = n1+n2+n3;
		int temp = tot;
		
		while(temp != 0)
		{
			int r = tot % 10; //get reminder
			sum = (sum * 10) + r; //calculation of pelindrom
			tot = tot / 10;
		}
		if(temp == sum){
			System.out.println("Pelindrom");
		}else{
			System.out.println("Not Pelindrom");
		}
		*/
	}

	void fibonacci(){
		int n1=0,n2=1,n3=0,count=10;
		System.out.println("Fibonacci : ");
		 for(int i = 2;i<count; i++){    
			n3 = n1 + n2;    
			n1 = n2;    
			n2 = n3;    
			System.out.print(" "+n3);   
		}
	}
	void sumOf(){
		System.out.println("Sum of 3 number : ");
		int sum1 = n1+n2;
		int sum2 = n2+n3;
		int sum3 = n3+n1;
		
		if(sum1<sum2 && sum1<sum2){
			System.out.println("");
		}
	}

}
public class prec{
	public static void main(String[] args){
			a a1 = new a();	
			a1.pelindrom();
			a1.fibonacci();
	}
}