// Vector Class
import java.util.Vector;

public class vector
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		v.add("dharmik");
		v.add("aatman");
		v.add("brijesh");
		v.add("darshan");
		v.add("rutvik");
		v.add("prakash");
		System.out.println(v);
		v.add("Rajkot");
		System.out.println(v);
		System.out.println(v.capacity());	// default capacity is 10
		System.out.println(v.size());
		v.remove(6);
		System.out.println(v);
	}
}