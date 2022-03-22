// file output(write) stream
import java.io.*;

public class fileOStream
{
	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		String s = "Hello, I'm a Pm Gohil. I'm a student of B.Sc.IT...^_^";
		byte b[] = s.getBytes();
		try{
			fos = new FileOutputStream("temp1.txt");
			fos.write(b);
			System.out.println("File created...^_^");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
}