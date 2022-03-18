import java.util.*;
public class stringCompare{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two string : ");
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		if(n1.compareTo(n2) == 0){
			System.out.println("Name is same...^_^");
		}else{
			System.out.println("Name is different...):");
		}

		if(n1 == n2){
			System.out.println("Name is same...^_^");
		}else{
			System.out.println("Name is different...):");
		}
	}
}