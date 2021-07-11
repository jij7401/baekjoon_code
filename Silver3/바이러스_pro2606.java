import java.util.*;
import java.io.*;

public class Main {
	
	static int n,k;
	static int[][] list;
	static boolean visit[];
	static int count = 0;
	static void put(int v, int w) {
		list[v][w] = 1;
		list[w][v] = 1;
	}
	
	static void dfs(int start) {
		visit[start] = true;
		for(int i = 0; i<visit.length;i++) {
			if(list[start][i] == 1 && visit[i] != true) {
				dfs(i);
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		list = new int[n][n];
		visit = new boolean[n];
		int v,w;
		int start = 0;		
		for(int i=0;i<k;i++) {
			v = scan.nextInt()-1;
			w = scan.nextInt()-1;
			put(v,w);
		}
		
		dfs(start);
		System.out.println(count);
		
	}
}