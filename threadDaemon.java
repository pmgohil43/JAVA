// Daemon Thread

class A extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon()){
			System.out.println("Is Daemon");
		}else{
			System.out.println("Other Threads");
		}
	}
}
public class threadDaemon
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1.setDaemon(true);
		a2.start();
		a3.start();
		a1.start();// get by JVM
	}
}