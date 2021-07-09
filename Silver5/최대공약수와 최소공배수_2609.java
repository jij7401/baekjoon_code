import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro_2609 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int mul = a*b;
		int r = -1;
		while (r!=0) {
			r = a%b;
			a = b;
			b = r;
		}
		bw.write(a+"\n");
		bw.write((mul/a)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}	
}
