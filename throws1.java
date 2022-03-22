// Throws Keywords
import pm.prakash;
import java.io.*;

class A
{
	void print()throws IOException
	{
		int n = 10, s;
		s = n/0;
		System.out.println("Example of throws keyword...");
	}
}
public class throws1
{
	public static void main(String[] args)
	{
		try{
			A a = new A();
			a.print();
		}catch(Exception e){
			System.out.println("Exception Handler : ");
		}
	}
}