import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		int[] cost = new int[n];
		int sum = 0;
		int total = 0;
		
		for(i=0;i<n;i++) {
			cost[i] = scan.nextInt();
		}
		
		Arrays.sort(cost);
		
		for(i=0;i<n;i++) {
			sum += cost[i];
			total += sum;
		}
		
		System.out.println(total);
	}
}
