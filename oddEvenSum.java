/*
	write a program to get values from the user and print odd number and even number also print sum of odd number 
	and even umber if sum is > 50 than divide by entered total number and multiplied by 3
	
	c#
	perform following action on the database 
		1. create database named as student
		2. create table named as sybsc
		3. filed name as id, name, contact, email and address
		4. perform insert qurey on the sybsc table
*/
import java.util.*;
class oddEvenSum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n1 = sc.nextInt();
		int i, e=0, o=0, totalE=0, mulE=0, divE=0, totalO=0, mulO=0, divO=0;
		for(i=1; i<=n1; i++)
		{
			if(i%2==0){
				e++;
				if(e >= 50){
					totalE = i+e;
					divE = totalO/n1;
				}else{
					totalE = i+e;
					mulE = totalE*3;
				}
			}else{
				o++;
				if(o >= 50){
					totalO = i+o;
					divO = totalO/n1;
				}else{
					totalO = i+o;
					mulO = totalO*3;
				}
			}
		}
		System.out.println("Diffrentiet of Odd or Even : ");
		System.out.println("Even : "+e);
		System.out.println("Odd : "+o);
		
		System.out.println("\nTotal and Multiplication of Even : ");
		System.out.println("Total even = "+ totalE);
		System.out.println("multipli by 3 = "+ mulE);
		System.out.println("divide by Enterd number = "+ divE);
		
		System.out.println("\nTotal and Multiplication of Even : ");
		System.out.println("Total even = "+ totalO);
		System.out.println("multipli by 3 = "+ mulO);
		System.out.println("divide by Enterd number = "+ divO);
		
	}
}