// File Input(read) stream

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileIStream
{
	public static void main(String[] args)
	{
		try{
			FileInputStream fis = new FileInputStream("temp.txt");
			int read = 0;
			while((read = fis.read()) != -1){
				System.out.print((char) read);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}