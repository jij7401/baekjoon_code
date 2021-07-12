import java.util.*;
import java.io.*;

public class Main {
	
	static int[][] map;
	static int m;
	static int n;
	static int k;
	static boolean[][] visit;
	
	static int dfs(int[][] map,int i, int j, boolean[][] visit) {
		if(visit[i][j] == true) 
			return 0;
		visit[i][j] = true;
		if(map[i][j] != 1) {
			return 0;
		}
		if(i != 0) 
			dfs(map, i-1, j, visit);
		if(i != n-1) 
			dfs(map, i+1, j, visit);
		if(j != 0) 
			dfs(map, i, j-1, visit);
		if(j != m-1) 
			dfs(map, i, j+1, visit);
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		
		while (testcase != 0) {
			m = scan.nextInt();
			n = scan.nextInt();
			k = scan.nextInt();
			int result = 0;			
			int x , y;
			map = new int[n][m];
			visit = new boolean[n][m];
			
			for(int i = 0; i < k; i++) {
				x = scan.nextInt();
				y = scan.nextInt();
				map[y][x] = 1;		
			}
			
			for(int i = 0; i< n; i++) {
				for(int j = 0; j<m; j++) {
					if(map[i][j] == 1 && !visit[i][j]) {
						result += dfs(map,i,j,visit);
					}
				}
			}
			
			System.out.println(result);
			testcase--;
		}
	}

}