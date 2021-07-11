import java.util.*;
import java.io.*;

public class Main {
	

	
	static long[] ps = new long[101];
	
	static long padovan_sequence(int n){		
		if(n <= 5) {
			return ps[n];
		}
		if(ps[n] != 0) {
			return ps[n];
		}
		
		return ps[n] = padovan_sequence(n-1) + padovan_sequence(n-5); 
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		int[] test = new int[testcase];
		ps[0] = 0;
		ps[1] = ps[2] = ps[3] = 1;
		ps[4] = ps[5] = 2; 
		for(int i=0;i<testcase;i++) {
			test[i] = scan.nextInt();
		}
		
		for(int i = 0; i<testcase;i++) {
		    System.out.println(padovan_sequence(test[i]));
		}
	}	
 
}
