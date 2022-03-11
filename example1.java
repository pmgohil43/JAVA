// WAP to scope of variable
public class example1
{
	public static void main(String[] args)
	{
		int x;
		x = 100; //x is known as 100 in all code
		if(x==100)
		{
			int y = 10;
			System.out.println("x and y : " + x +" "+ y);
			x=y*2;
		}
		System.out.println("x is "+x);
	}
}