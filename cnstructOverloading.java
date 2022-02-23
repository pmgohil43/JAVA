import java.util.*;
class load{
	load(){
		System.out.println("Singal constructor");
	}
	load(int a1){
		System.out.println(a1);
	}
	
}
public class constructOverloading{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.nextLine();
		
		load l = new l();
		load l = new l(a);
		load l = new l(a,b);
		load l = new l(c);
	}
}