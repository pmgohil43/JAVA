//Access Specifiers

class a
{
	void aa()
	{
		System.out.println("Default");
	}
	public void bb()
	{
		System.out.println("Public");
	}
	private void cc()
	{
		System.out.println("Private");
	}
	protected void dd()
	{
		System.out.println("Protected");
	}
}
public class AccessSpecifiers
{
	public static void main(String[] args)
	{
		a a1 = new a();
		a1.aa();
		a1.bb();
		//a1.cc();	// we can not access private method in other class 
		a1.dd();
	}
}
