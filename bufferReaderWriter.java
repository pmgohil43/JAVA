// file read and write
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferReaderWriter
{
	public static void main(String[] args)
	{
		try{
			FileWriter fileWrite = new FileWriter("Data3.txt");
			BufferedWriter bWriter = new BufferedWriter(fileWrite);
			bWriter.write("Hello");
			bWriter.append("\nThank You");
			bWriter.close();

			FileReader fileRead = new FileReader("Data3.txt");
			BufferedReader bReader = new BufferedReader(fileRead);
			int i = 0;
			while ((i = bReader.read()) != -1) {
				System.out.print((char) i);
			}
			bReader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}