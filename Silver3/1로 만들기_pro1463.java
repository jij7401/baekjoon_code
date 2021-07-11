import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int result = 0;
		int min = 999999;
		int count = 0;
		int[] arr = new int [n+1];
        arr[1] = 0;
        
        for (int i = 2 ; i <= n ; i++) {
            if (i%6 == 0)
                arr[i] = Math.min(arr[i/3], arr[i/2]) + 1;
            else if (i%3 == 0)
                arr[i] = Math.min(arr[i/3], arr[i-1]) + 1;
            else if (i%2 == 0)
                arr[i] = Math.min(arr[i/2], arr[i-1]) + 1;
            else arr[i] = arr[i-1] + 1;
        }
        System.out.println(arr[n]);
	}
	
}
	
	