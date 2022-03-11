/*
	WAP to convert sum one type to another type
	
	int -> int
	int -> float
	int -> char
	int -> string
	
	float -> int
	float -> float
	float -> char
	float -> string
	
	char -> int
	char -> float
	char -> char
	char -> string
	
	string -> int
	string -> float
	string -> char
	string -> string

	compile package -> javac -d . pack.java
*/
package p1;

public class pack
{
	public void intToInt(int n1, int n2)
	{
		int sum = n1 + n2;
		System.out.println("Int to Int : "+sum);
	}
	
	public void intToFloat(int n1, float n2)
	{
		float sum = n1 + n2;
		System.out.println("Int to Float : "+sum);
	}
	
	public void intToChar(int n1, char n2)
	{
		int tempC = n2;
		int sum = n1 + tempC;
		System.out.println("Int to Char : "+sum);
	}
	
	public void floatToInt(float n1, int n2)
	{
		float sum = n1 + n2;
		System.out.println("Float to Int : "+sum);
	}
	
	public void floatToFloat(float n1, float n2)
	{
		float sum = n1 + n2;
		System.out.println("Float to Float : "+sum);
	}
	
	public void floatToChar(float n1, char n2)
	{
		float tempC = n2;
		float sum = n1 + tempC;
		System.out.println("float to Char : "+sum);
	}
	
	public void charToInt(char n1, int n2)
	{
		char tempC = n1;
	//	System.out.println(tempC);
		int sum = tempC + n2;
		System.out.println("Char to Int : "+sum);
	}
	
	public void charToFloat(char n1, float n2)
	{
		char tempC = n1;
		float sum = tempC + n2;
		System.out.println("Char to Float : "+sum);
	}
	
	public void charToChar(char n1, char n2)
	{
		char tempC = n1;
		int sum = tempC + n2;
		System.out.println("Char to Char : "+sum);
	}	
}