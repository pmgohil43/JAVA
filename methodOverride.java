//method override
import java.util.*;
class a{
	static void friend(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks of friend : ");
		int m1,m2,m3,m4,sum,pr;
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		sum = m1+m2+m3+m4;
		pr = sum/4;
		System.out.println("Mark avarage of friend : "+pr);
	}
}
class b extends a{
	static void friend(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks of me : ");
		int m1,m2,m3,m4,sum,pr;
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		sum = m1+m2+m3+m4;
		pr = sum/4;
		System.out.println("Mark avarage of me : "+pr);
	}
}
public class methodOverride{
	public static void main(String[] args){
		a a1 = new b();
		a1.friend();
		b b1 = new b();
		b1.friend();
		a a3 = new a();
		a3.friend();		
	}
}