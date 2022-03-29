// Method Overriding
import java.util.Scanner;
class a1{
	void test(int a){
		System.out.println("1 perameter : "+a);
	}
}
class b1{
	void test(int b, int c){
		System.out.println("2 perameter : "+(b+c));
	} 
}
class c1{
	void test(int d, int e, int f){
		System.out.println("2 perameter : "+(d+e+f));
	}
}
public class overriding
{
	public static void main(String[] arts)
	{
		System.out.println("Enter a parameter (1,2,3) : ");
		Scanner sc = new Scanner(System.in);
		int n,n1,n2,n3;
		n = sc.nextInt();
		
		switch(n)
		{
			case 1 :
				System.out.println("Enter a 1 number : ");
				n1 = sc.nextInt();
				a1 a11 = new a1();
				a11.test(n1);
				break;
			case 2 :
			System.out.println("Enter a 2 number : ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				b1 b11 = new b1();
				b11.test(n1,n2);
				break;
			case 3 :
			System.out.println("Enter a 3 number : ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				n3 = sc.nextInt();
				c1 c11 = new c1();
				c11.test(n1,n2,n3);
				break;
			default :
				System.out.println("Enter a valid choise");
				break;
		}
	}
}