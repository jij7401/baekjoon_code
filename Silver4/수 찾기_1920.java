import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	
	static int binary_search(int[] a, int key, int n, int m) {
		int pl = 0;
		int pr = n-1;
		int pc;
		
		do {
			pc = (pl+pr)/2;
			
			if(a[pc] == key) {
				return 1;
			}
			else if(a[pc] < key) {
				pl = pc+1;
			}
			else { 
				pr = pc-1;
			}
			
		}while(pl <= pr);
		
		return 0;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = scan.nextInt();
		}
		Arrays.sort(a);
		int[] result = new int[m];
		for(int i=0;i<m;i++) {
			result[i] = binary_search(a,b[i],n,m);
		}
		for(int i=0;i<m;i++) {
			System.out.println(result[i]);
		}
	}

}