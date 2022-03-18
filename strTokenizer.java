// String Tokenizer
import java.util.StringTokenizer;

public class strTokenizer
{
	public static void main(String[] args)
	{
		StringTokenizer st1 = new StringTokenizer("I'm a IT Student");
		System.out.println(st1.countTokens());
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
		System.out.println();
		
		StringTokenizer st2 = new StringTokenizer("I'm a IT Student...","^_^");
		System.out.println(st2.countTokens());
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}
		System.out.println();
		
		StringTokenizer st3 = new StringTokenizer("I'm a IT Student...","^_^",true);
		System.out.println(st3.countTokens());
		while(st3.hasMoreTokens())
		{
			System.out.println(st3.nextToken());
		}
	}
}