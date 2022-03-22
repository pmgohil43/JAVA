// Random Access File class
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccess
{
	public static void main(String[] args)
	{
		try {
			RandomAccessFile writefile = new RandomAccessFile("temp2.txt", "rw");
			writefile.seek(0);
			writefile.write(new String("Prakash").getBytes());
			writefile.close();
			System.out.println("temp2 named has been created...^_^");

			RandomAccessFile readfile = new RandomAccessFile("temp2.txt", "r");
			readfile.seek(0);
			byte[] bytes = new byte[100];
			readfile.read(bytes);
			readfile.close();

			System.out.println(new String(bytes));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}