// data input(read) output(write) stream

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataIOStream
{
	public static void main(String[] args)
	{
		try{
			FileOutputStream fos = new FileOutputStream("temp.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeBytes(new String("Welcome to the adorable world...^_^\n"));
			dos.writeChars("This is new String...^_^\n");
			dos.writeBoolean(true);
			dos.writeFloat(15.60f);
			System.out.println("Data write successfully...^_^");
			FileInputStream fis = new FileInputStream("temp.txt");
			DataInputStream dis = new DataInputStream(fis);
			int count = fis.available();
			byte[] getData = new byte[count];
			dis.read(getData);
			for(byte dt : getData){
				System.out.print((char)dt);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}