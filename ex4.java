/*
	WAP to find the student's avarage marks of the three subjects and print it along with the 
	student's I'd and name.
*/
import java.util.*;
public class ex4{
	public static void main(String args[]){
		
		System.out.println("Enter a I'd, Name, Marks(3 Subject) : ");
		Scanner sc = new Scanner(System.in);
		
		String name;
		int id, m1,m2,m3,tot;
		float avg;

		//sc.next();
		id = sc.nextInt();
		sc.nextLine();
		name = sc.nextLine();
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		tot = m1+m2+m3;
		avg = tot/3;
		
		System.out.println("I'd : "+id);
		System.out.println("Name : "+name);		
		System.out.println("Your avarage is : "+ avg);
	}
}
		