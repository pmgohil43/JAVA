import java.util.*;
public class ex3{
	public static void main(String[] args){
		System.out.println("Enter a numbers : ");
		Scanner sc = new Scanner(System.in);
		short n1,n2,n3,n4,n5,tot;
		n1 = sc.nextShort();
		n2 = sc.nextShort();
		n3 = sc.nextShort();
		n4 = sc.nextShort();
		n5 = sc.nextShort();
		tot = (short)(n1+n2+n3+n4+n5);
		System.out.println("TOTAL : " + tot);
	}
}