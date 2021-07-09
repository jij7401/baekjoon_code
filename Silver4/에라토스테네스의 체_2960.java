import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int i,j;
		int p;
		int count=0;
        int result = 0;		
		
		int[] pn = new int[n-1];
		for(i=0;i<pn.length;i++) {
			pn[i] = i+2;
		}
		
		p = pn[0];
		
		for(i=0;i<pn.length;i++) {
			for(j=0;j<pn.length;j++) {
				if(pn[j] % p == 0) {
	                count++;
	                if(count == k) {
						result = pn[j];
						break;
					}
					pn[j] = 1009;
				}
			}
			Arrays.sort(pn);
			p = pn[0];
		}
		
		System.out.println(result);
	} 
}
