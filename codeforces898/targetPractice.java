import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		while(t-->0){
			int n = 10;
			
			char[][] arr = new char[10][10];
			int count = 0;
			
			for(int i=0; i<n; i++){
				String line = sc.next();
				for(int j=0; j<n; j++){
					arr[i][j] = line.charAt(j);
					// System.out.print(arr[i][j] + " ");
					if(((i==0 && j<=9 && j>=0) || (i==9 && j<=9 && j>=0) || (j==0 && i<=9 && i>=0) || (j==9 && i<=9 && i>=0) ) && arr[i][j]=='X'){
						// System.out.print(arr[i][j] + " ");
						count = count + 1;

					}
					else if(((i==1 && j<=8 && j>=1) || (i==8 && j<=8 && j>=1) || (j==1 && i<=8 && i>=1) || (j==8 && i<=8 && i>=1) ) && arr[i][j]=='X'){
						// System.out.print(arr[i][j] + " ");
						count = count + 2;
					}
					else if(((i==2 && j<=7 && j>=2) || (i==7 && j<=7 && j>=2) || (j==2 && i<=7 && i>=2) || (j==7 && i<=7 && i>=2) ) && arr[i][j]=='X'){
						// System.out.print(arr[i][j] + " ");
						count = count + 3;
					}
					
					else if(((i==3 && j<=6 && j>=3) || (i==6 && j<=6 && j>=3) || (j==3 && i<=6 && i>=3) || (j==6 && i<=6 && i>=3) ) && arr[i][j]=='X'){
						// System.out.print(arr[i][j] + " ");
						count = count + 4;
					}
	
					
					else if(((i==4 && j==4) || (i==4 && j==5) || (i==5 && j==4) || (i==5 && j==5)) && arr[i][j]=='X'){
						// System.out.print(arr[i][j] + " ");
						count = count + 5;

					}
				}
				// System.out.println(count);
					// System.out.println();
			}
			
			System.out.println(count);
			// for(int i=0; i<n; i++){
			// 	String line = sc.next();
			// 	for(int j=0; j<n; j++){
			// 		if(i==0){
			// 			System.out.print(arr[i][j] + " ");
			// 		}
			// 	}
			// 	System.out.println();
			// }
		}
		
	}
}
