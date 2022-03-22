// Try Catch
import pm.prakash;

public class tryCatch
{
	public static void main(String[] args)
	{
		try{
			int n = 10;
			int sum2 = n/0; // its return java.lang.ArithmeticException: / by zero
			System.out.println("sum 2 : "+sum2);
			
		}catch(Exception e){
			System.out.println("exception : "+e);//java.lang.ArithmeticException: / by zero
		}
	}
}