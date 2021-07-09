import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		int i;
		int first_num;
		int last_num = 0;
		
		for(i=1;i<=n;i++) {
			deque.offer(i);
		}
		
		while(true) {
            if(deque.size() == 1) {
				break;
			}
			deque.poll();
			last_num = deque.peek();
			deque.poll();
			deque.offerLast(last_num);
		}
		
		System.out.println(deque.peek());
		
		
	}
}
