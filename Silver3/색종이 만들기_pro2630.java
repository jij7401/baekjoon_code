import java.util.*;
import java.io.*;

public class Main {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static int paper[][];
	static int whitepaper=0;
	static int bluepaper=0;
	
	public static void main(String args[]) throws Exception {
		int num=Integer.parseInt(br.readLine());
		paper=new int[num][num];
		for(int i=0;i<num;i++) {
			String s[]=br.readLine().split(" ");
			for(int j=0;j<num;j++) {
				paper[i][j]=Integer.parseInt(s[j]);
			}
		}
		function(0, 0, num);
		bw.write(whitepaper+"\n"+bluepaper);
		bw.flush();
		bw.close();
	}
	
	static void function(int start_i, int start_j, int n) {
		if(n==1) {
			if(paper[start_i][start_j]==1) 
				bluepaper++;
			else if(paper[start_i][start_j]==0) 
				whitepaper++;
			return;
		}
		int sum=0;
		for(int i=start_i;i<start_i+n;i++) {
			for(int j=start_j;j<start_j+n;j++) {
				sum += paper[i][j];
			}
		}
		if(sum==n*n) {
			bluepaper++;
		}
		else if(sum==0) {
			whitepaper++;
		}
		else {
			function(start_i, start_j, n/2);
			function(start_i, start_j+n/2, n/2);
			function(start_i+n/2, start_j, n/2);
			function(start_i+n/2, start_j+n/2, n/2);
		}
	}
}
