import java.util.*;
class Array1d{
	Scanner sc = new Scanner(System.in);
	void array1d(){
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for(int i = 0; i<=n; i++)
		{
			System.out.println("1D Array : "+i);
		}
	}
}
class Array2d extends Array1d{
	Scanner sc = new Scanner(System.in);
	void array2d(){
		System.out.println("Enter 1st number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int n2 = sc.nextInt();
		int[][] arr2d = new int[n1][n2];
		
        System.out.println("arr[0][0] = " + arr2d[0][0]);
		for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[i].length; j++){
                arr2d[i][j] = 1; 
			}
			System.out.println();
		}
		for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[i].length; j++){
                System.out.println("arr2d[" + i + "][" + j + "] = " + arr2d[i][j]);
			}
			System.out.println();
		}
	}
}
class JaggedArr extends Array2d{
	JaggedArr(){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a row : ");
		//int r = sc.nextInt();
		int[][] twoDA = new int[2][];
		
		//System.out.println("Enter a column : ");
		//int c1 = sc.nextInt();
		twoDA[0] = new int[5];
		twoDA[1] = new int[8];
		
		int count = 0;
		//initialize array
		for(int i=0; i<twoDA.length; i++){
			for(int j=0; j<twoDA[i].length; j++){
				twoDA[i][j] = count++;
			}
		}
		//print array
		for(int i=0; i<twoDA.length; i++){
			for(int j=0; j<twoDA[i].length; j++){
				System.out.println(twoDA[i][j] + " ");
			}
		}
	}
}
public class jaggedArray{
	public static void main(String args[])
	{
		JaggedArr j = new JaggedArr();
		j.array1d();
		j.array2d();
	}
}