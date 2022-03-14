// create new file on our drive 
import pm.prakash;
import java.io.*;
import java.util.Scanner;
public class io1
{
	public static void main(String[] args)
	{
		try{
			String d = "Create new file on our drive...^_^";
			prakash p = new prakash(d);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a file name which u want to create...");
			String s = sc.nextLine();
			File f = new File(s);
			f.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}