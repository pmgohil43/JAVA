/*
	hollow rectangle
	* * * * *
	*		*
	*		*
	*		*
	* * * * *
*/
import java.util.*;
public class hollowrect{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n,m;
		System.out.println("Enter a column : ");
		n = sc.nextInt();
		System.out.println("Enter a row : ");
		m = sc.nextInt();
		for(i=0; i<=n; i++){
			for(j=0; j<=m; j++){
				if(i==0 || i==n || j==0 || j==m){
					System.out.print(" ^_^ ");
				}else{
					System.out.print("     ");
				}
			}
			System.out.println("");
		}
	}	
}