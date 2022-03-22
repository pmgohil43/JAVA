// Stream Tokenizer

import java.io.IOException;
import java.io.InputStream;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class streamTokenizer
{
	public static void main(String[] args) {
		
		StringReader s = new StringReader("Hello, I'm a Pm Gohil. I'm a student...@_@");
		StreamTokenizer st = null;
		st= new StreamTokenizer(s);
		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				if (st.ttype == StreamTokenizer.TT_WORD) {
					System.out.println("Word : " + st.sval);	
				} else if (st.ttype == StreamTokenizer.TT_NUMBER) {
					System.out.println("Number : " + st.nval);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}