// Wrapper Class

public class wrapper
{
	public static void main(String[] args)
	{
		int a = 20;
		Integer a1 = Integer.valueOf(a); //explicitly converting int
		Integer a2 = a1; //autoboxing compiler will write Integer.valueOf(a) automatically
		System.out.println(a+" : "+a1+" : "+a2);
		
		Integer b1 = new Integer(45); //wrapper class object
		int b = b1.intValue(); //explicitly converting Integer
		int c = b; //unboxing compiler will write b1.intValue() automatically
		System.out.println(b1+" : "+b+" : "+c);
	}
}