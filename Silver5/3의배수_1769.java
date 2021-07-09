import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class pro_1769 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		int i;
		int sum = 0;
		int count = 0;
		while(num.length() >= 2) {
			for(i=0;i<num.length();i++) {
				sum += num.charAt(i)-48;
			}
			count++;
			num = Integer.toString(sum);
	        sum = 0;
		}
		
		
		System.out.println(count);
		
		if(Integer.parseInt(num) % 3 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		
	}
}

