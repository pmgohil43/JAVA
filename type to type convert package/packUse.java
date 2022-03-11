//Use package
import p1.pack;
import java.util.Scanner;

public class packUse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		pack pObj = new pack();
		int nm;
		int tot;
		System.out.println("1. Int to Int\t\t2. Int to Float\t\t3. Int to Char");
		System.out.println("4. Float to Int\t\t5. Float to Float\t6. Float to Char");
		System.out.println("7. Char to Int\t\t8. Char to Float\t9. Char to Char");
		System.out.println("Enter your choise as per above : ");
		nm = sc.nextInt();
		switch(nm)
		{
			case 1:
				System.out.println("Your choise is 'Int to Int'");
				System.out.println("Enter a two number(int or int) : ");
				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
				pObj.intToInt(a1,a2);
				break;
			case 2:
				System.out.println("Your choise is 'Int to Float'");
				System.out.println("Enter a two number(int or float) : ");
				int b1 = sc.nextInt();
				float b2 = sc.nextFloat();
				pObj.intToFloat(b1,b2);
				break;
			case 3:
				System.out.println("Your choise is 'Int to Char'");
				System.out.println("Enter a two number(int or char) : ");
				int c1 = sc.nextInt();
				char c2 = sc.next().charAt(0);
				pObj.intToChar(c1,c2);
				break;
			case 4:
				System.out.println("Your choise is 'Float to Int'");
				System.out.println("Enter a two number(float or int) : ");
				float e1 = sc.nextInt();
				int e2 = sc.nextInt();
				pObj.floatToInt(e1,e2);
				break;
			case 5:
				System.out.println("Your choise is 'Float to Float'");
				System.out.println("Enter a two number(float or float) : ");
				float f1 = sc.nextInt();
				float f2 = sc.nextFloat();
				pObj.floatToFloat(f1,f2);
				break;
			case 6:
				System.out.println("Your choise is 'Float to Char'");
				System.out.println("Enter a two number(float or char) : ");
				float g1 = sc.nextInt();
				char g2 = sc.next().charAt(0);
				pObj.floatToChar(g1,g2);
				break;
			case 7:
				System.out.println("Your choise is 'Char to Int'");
				System.out.println("Enter a two number(char or int) : ");
				char i1 = sc.next().charAt(0);;
				int i2 = sc.nextInt();
				pObj.charToInt(i1,i2);
				break;
			case 8:
				System.out.println("Your choise is 'Char to Float'");
				System.out.println("Enter a two number(char or float) : ");
				char j1 = sc.next().charAt(0);;
				float j2 = sc.nextFloat();
				pObj.charToFloat(j1,j2);
				break;
			case 9:
				System.out.println("Your choise is 'Char to Char'");
				System.out.println("Enter a two number(char or char) : ");
				char k1 = sc.next().charAt(0);;
				char k2 = sc.next().charAt(0);
				pObj.charToChar(k1,k2);
				break;
			default:
				System.out.println("Pleas, Enter a valid choise..!");
		}
	}
}