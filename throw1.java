// Throw keyword
import pm.prakash;
public class throw1
{
	public static void main(String[] args)
	{
		int n = 10;
		if(n >= 18){
			System.out.println("Eligible for voot");
		}else{
			throw new ArithmeticException("Not eligible for voot");
		}
	}
}