// file reader class and writer class
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter
{
	public static void main(String[] args)
	{
		try{
			FileWriter fw = new FileWriter("temp.txt");
			fw.write("Welcome to Rajkot...@_@");
			fw.close();
			
			FileReader fr = new FileReader("temp.txt");
			int i = 0;
			while((i=fr.read()) != -1){
				System.out.print((char)i);
			}
			fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}