import java.util.*;
import java.io.*;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		
		while(testcase > 0) {
			testcase--;
			int n = scan.nextInt();
			int[][] sticker = new int[2][100001];
			int[][] dp = new int[2][100001];
			
			
			for(int i = 0; i<=1; i++) {
				for(int j=1; j<=n;j++) {
					sticker[i][j] = scan.nextInt();
				}
			}
			
			 dp[0][0] = dp[1][0] = 0;
			 dp[0][1] = sticker[0][1];	
			 dp[1][1] = sticker[1][1];
			
			for (int i = 2; i <= n; i++) {
				dp[0][i] = (int) Math.max(dp[1][i - 1], dp[1][i - 2]) + sticker[0][i];
				dp[1][i] = (int) Math.max(dp[0][i - 1], dp[0][i - 2]) + sticker[1][i];
			}
			System.out.println((int)Math.max(dp[0][n], dp[1][n]));
		}
		
	}
}
