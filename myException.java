// My Exception

class Ex extends Exception
{
	public Ex(String s1)
	{
		/*int n = 10,s;
		s = n/2;*/
		System.out.println("This is constructor...");
	}
}
public class myException
{
	public static void main(String[] args)
	{
		try{
			System.out.println("this is main method");
			throw new Ex("GeeksGeeks");
		}catch(Ex e){
			System.out.println("Exception Handle");
			System.out.println(e.getMessage());
		}
	}
}