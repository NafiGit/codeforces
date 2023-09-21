import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		for(int j=0; j<t; j++){
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			
			int min_val = Integer.MAX_VALUE;
			for(int i=0; i<n; i++){
				if(arr[i] < min_val){
					min_val = arr[i];
				}
			}
			int mul = 1;
			
			for(int i=0; i<n; i++){
				if(arr[i] == min_val){
					mul = mul * (arr[i] + 1);
					min_val = -3829383;
				}
				else{
					mul = mul * arr[i];
				}
				
			}
			System.out.println(mul);

			
		}
		
	}
}
