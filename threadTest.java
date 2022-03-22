// Test Tread
class A extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
}
public class threadTest
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1.setName("Rajkot");
		a2.setName("Jetpur");
		a3.setName("Surat");
		
		a1.setPriority(Thread.MIN_PRIORITY);//01
		a2.setPriority(Thread.NORM_PRIORITY);//05
		a3.setPriority(Thread.MAX_PRIORITY);//10
		
		a1.start();
		System.out.println(a1.getId()+" : "+a1.getName());
		
		a2.start();
		System.out.println(a2.getId()+" : "+a2.getName());
		
		a3.start();
		System.out.println(a3.getId()+" : "+a3.getName());
	}
}