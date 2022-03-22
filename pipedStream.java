// Piped Stream

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class pipedStream
{
	public static void main(String[] args)
	{
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		try{
			pis.connect(pos);
			
			pos.write(new String("P").getBytes());
			System.out.println(pis.available());
			System.out.println("pis Used : " + (char) pis.read());
			System.out.println(pis.available());

			pos.write(new String("Ok").getBytes()); 
			System.out.println(pis.available()); 
			System.out.println("pis Used : " + (char) pis.read());
			System.out.println(pis.available()); 

			pos.write(new String("S").getBytes()); 
			System.out.println(pis.available());
			System.out.println("pis Used : " + (char) pis.read());
			System.out.println(pis.available());
			
			pis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}