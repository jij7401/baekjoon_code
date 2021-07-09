import java.lang.*;
import java.util.*;
import java.io.*;

public class pro_11650 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int i;
		int j;
		
		for(i=0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			for(j=0;j<2;j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		Arrays.sort(arr, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for(i = 0; i<n; i++) {
	   		   for(j = 0; j<2; j++) {
	   			   System.out.print(arr[i][j]+" ");
	   		   }System.out.println("");
	   	   }
	}

}
