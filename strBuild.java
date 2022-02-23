import java.util.*;
public class strBuild{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String nm = sc.nextLine();
		StringBuilder sb = new StringBuilder(nm);
		System.out.println(sb.reverse().toString());
	}
}