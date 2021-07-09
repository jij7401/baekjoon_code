import java.lang.*;
import java.util.*;

public class pro_1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i;
		int[] inside = new int[10];
		int count = 1;
		int index = 0;
		
		for(i = 1000000000; i>0; i = i/10) {
			if(i == 1) {
				inside[0] = n;
				break;
			}
			
			inside[i/(i/10) - count] = n / i;
			if(inside[i/(i/10) - count] > 0) {
				n = n - inside[i/(i/10) - count] * i;
			}
			count++;
		}
		
		for(i=0;i<10;i++) {
			if(inside[9-i] != 0) {
				index = i;
				break;
			}
		}
				
		Arrays.sort(inside);
		
		for(i=0;i<10-index;i++) {
			System.out.print(inside[9-i]);
		}
		
	}
}