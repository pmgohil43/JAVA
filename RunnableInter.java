// Implements Runnable interface

public class RunnableInter implements Runnable
{
	public void run()
	{
		System.out.println("This is a runnable interface...");
	}
	public static void main(String[] args)
	{
		RunnableInter ri = new RunnableInter();
		Thread t = new Thread(ri);
		t.run();
	}
}