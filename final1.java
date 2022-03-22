// Finally
import pm.prakash;
public class final1
{
	public static void main(String[] args)
	{
		String d = "Example of Final keyword";
		prakash p = new prakash(d);
		try{
			int n = 10, s;
			s = n / 2;
			System.out.println(s);
		}finally{
			System.out.println("Finally");
		}
	}
}