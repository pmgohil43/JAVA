import java.io.File;
import java.io.IOException;

public class file1
{
	public static void main(String[] args)
	{
		// first of all create a text file which know as 'temp.txt'
		File f1 = new File("temp.txt");
		if(f1.exists()){
			try{
				System.out.println("File Path : "+ f1.getAbsolutePath());
				System.out.println("Read Permission : "+f1.canRead());
				System.out.println("Write Permission : "+f1.canWrite());
				System.out.println("File Path : "+f1.getCanonicalPath());
				System.out.println("Free Space in Bytes : "+f1.getFreeSpace());
			}catch(IOException e){
				e.printStackTrace();
			}
		}else{
			System.out.println("File not available");
		}
	}
}