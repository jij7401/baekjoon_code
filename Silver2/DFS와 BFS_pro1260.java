import java.util.*;
import java.io.*;

public class Main {
	
	static class Node_dfs{
		int[][] list;
		boolean[] visit;
		
		Node_dfs(int n){
			this.list = new int[n][n];
			this.visit = new boolean[n];
		}
		
		void put(int v, int w) {
			list[v][w] = 1;
			list[w][v] = 1;
		}
		
		void dfs(int start) {
			visit[start] = true;
			System.out.print(start+1+ " ");
			for(int i = 0;i<visit.length;i++) {
				if(list[start][i] == 1 && visit[i] != true) {
					dfs(i);
				}
			}
			
		}
	}
	
	static class Node_bfs{
		int[][] list, n;
		boolean[] visit;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		Node_bfs(int n){
			this.list = new int[n+1][n+1];
			this.visit = new boolean[n+1];
		}
		
		void put(int v, int w) {
			list[v][w] = 1;
			list[w][v] = 1;
		}
		
		void bfs(int start) {
			visit[start] = true;
			queue.offer(start);
			
			while(queue.size() != 0) {
				start = queue.poll();
				System.out.print(start+" ");
				for(int i = 1;i<visit.length;i++) {
					if(list[start][i] == 1 && visit[i] != true) {
						queue.offer(i);
						visit[i] = true;
					}
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n2 = scan.nextInt();
		int start = scan.nextInt();
		Node_dfs node_dfs = new Node_dfs(n);
		Node_bfs node_bfs = new Node_bfs(n);
		int v,w;
		
		for(int i=0; i<n2; i++) {
			v = scan.nextInt();
			w = scan.nextInt();
			node_dfs.put(v-1, w-1);
			node_bfs.put(v, w);
		}
		
		node_dfs.dfs(start-1);
		System.out.println();
		node_bfs.bfs(start);
	}
}
