import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] coin = new int[n];
		int i;
		int[] temp = new int[n];
		int midcost;
		for(i=0;i<coin.length;i++) {
			coin[i] = scan.nextInt();
		}
		
		for(i=0;i<coin.length;i++) {
			midcost = k / coin[(n-1)-i];
			temp[(n-1)-i] = (k / coin[(n-1)-i]);
			if(midcost > 0) {
				k = k - midcost*coin[(n-1)-i];
			}
		}
		
		int sum = 0;
		
		for(i=0;i<temp.length;i++) {
			if(temp[i] > 0) {
				sum += temp[i];
			}
		}
		
		System.out.println(sum);
		
	}
}
