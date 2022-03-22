// Joining of Thread
class A extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
public class joinThread
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1.setName("Prakash");
		a2.setName("Pm");
		a3.setName("Gohil");
		a1.start();
		
		try{
			a1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		a2.start();
		a3.start();
	}
}