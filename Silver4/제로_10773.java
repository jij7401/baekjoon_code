import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		
		int k = Integer.parseInt(br.readLine());
		int i;
		int sum=0;
		int count = 0;
		int[] tmp = new int[k];
		int temp;
		
		for(i=0;i<k;i++) {
			String s = br.readLine();
			int value;
			value = Integer.parseInt(s);
			stack.push(value);	
		}
		
		for(i=0;i<k;i++) {
			if(stack.peek() == 0) {
				stack.pop();
				count++;
			}
			else {
				if(count > 0) {
					stack.pop();
					count--;
				}
				else {
					temp = stack.peek();
					stack.pop();
					sum += temp;
				}
			}
		}
		bw.write(sum+"\n");
		bw.flush();
		bw.close();
 	}
}