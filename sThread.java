// Syncronyced thread

class a
{
	synchronized void printA(int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(" "+i);
		}
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class b extends Thread
{
	a a1 = new a();
	public b(a a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.printA(10);
	}
}
class c extends Thread
{
	a a1 = new a();
	public c(a a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.printA(10);
	}
}
public class sThread
{
	public static void main(String[] args)
	{
		a a1 = new a();
		b b1 = new b(a1);
		c c1 = new c(a1);
		b1.start();
		c1.start();
	}
}