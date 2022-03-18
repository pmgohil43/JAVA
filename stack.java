// Stack
import java.util.Stack;

public class stack
{
	public static void main(String[] args)
	{
		Stack<String> st = new Stack<>();
		System.out.println(st.isEmpty());
		st.add("java");
		st.add("os");
		st.add("net");
		st.add("C#");
		st.push("cf");
		st.push("c");
		st.remove(1);
		st.remove("cf");
		
		System.out.println(st.firstElement());
		System.out.println(st.lastElement());
		System.out.println(st.isEmpty());
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
	}
}