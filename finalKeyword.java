// Final Keyword

final class name
{
	final String nm; // blank declaration
	public name()
	{
		nm = "Prakash Gohil";
		System.out.println("My Name is "+nm);
	}
	final void changeName()
	{
		//nm = "Prakash"; // we can not change name if we change datatype than we change name
		System.out.println(nm);
	}
	void cNm(final String nm1)
	{
		System.out.println(nm + " : " +nm1);
	}
}
public class finalKeyword
{
	public static void main(String[] args)
	{
		name n = new name();
		
		n.changeName();
		n.cNm("Aatman");
	}
}