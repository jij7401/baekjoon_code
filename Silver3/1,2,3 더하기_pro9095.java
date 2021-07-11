import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
 		int testcase = scan.nextInt();
 		int[] arr = new int[testcase];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(div(arr[i]));
		}
	}
	
	static int div(int n) {
		if(n == 1) {
			return 1;
		}
		else if(n == 2) {
			return 2;
		}
		else if(n == 3) {
			return 4;
		}
		else {
			return div(n-1)+div(n-2)+div(n-3);
		}
	}
}