// Stream writer and reader
import java.io.*;

public class streamWriterReader
{
	public static void main(String[] args) {
		try {
			OutputStream writefile = new FileOutputStream("temp.txt");
			Writer dataWrite = new OutputStreamWriter(writefile);
			dataWrite.write("I'm stay in my home...@_^");
			dataWrite.close();

			FileInputStream readfile = new FileInputStream("temp.txt");
			Reader dataReader = new InputStreamReader(readfile);
			int data = dataReader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = dataReader.read();
			}
			InputStreamReader ins = new InputStreamReader(readfile);
			String str = ins.getEncoding();
			System.out.println("\nOkay : " +str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}