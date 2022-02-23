import java.util.Scanner;
class a{
	int n1 = 10;
	int n2 = 10;
	a(int n1, int n2){
		int abc = this.n1+this.n2;
		System.out.println("abc : " + abc);
		int ans = n1 + n2;
		System.out.println("answer : " + ans);
		System.out.println("answer : " + (n1 + n2));
	}
}
public class task{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		a a1 = new a(n1,n2);
	}
}