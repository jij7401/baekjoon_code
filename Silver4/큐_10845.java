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
		Deque<Integer> queue = new ArrayDeque<Integer>();
		
		int testcase = Integer.parseInt(br.readLine());
		int i;
		for(i=0;i<testcase;i++) {
			String s = br.readLine();
			int value;
			String[] tmp;
			
			if(s.matches("push.*")) {
				tmp = s.split(" ");
			    value = Integer.parseInt(tmp[1]);
			    queue.offer(value);
			}
			
			else if(s.contentEquals("pop")) {
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
				}
				else {
					bw.write(queue.poll()+"\n");
				}
			}
			
			else if(s.contentEquals("empty")) {
				if(queue.isEmpty()) {
					bw.write("1"+"\n");
				}else {
				    bw.write("0"+"\n");
				}
			}
			
			else if(s.contentEquals("front")) {
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(queue.peek()+"\n");
				}
			}
			else if(s.contentEquals("size")) {
				bw.write(queue.size()+"\n");
			}
			else if(s.contentEquals("back")) {
				bw.write(queue.isEmpty()?"-1\n":queue.getLast()+"\n");
			}



		}
		bw.flush();
		bw.close();
		
		
	}
}
