// Date Functions
import java.util.*;

public class dateMethod
{
	public static void main(String[] args) throws NullPointerException
	{
		Date dt = new Date();
		dt.getTime();
		System.out.println(dt);
		
		Date dt1 = new Date();
		dt1.setTime(121321L);
		System.out.println(dt1);
	}
}