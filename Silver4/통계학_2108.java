import java.lang.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        ArrayList<Integer> statistics = new ArrayList<Integer>();
		
		int n = scan.nextInt();
		int i;
		int[] freqCheck = new int [8001];

		for(i=0;i<n;i++) {
			statistics.add(scan.nextInt());
			freqCheck[statistics.get(i)+4000]++; 
		}
		
		Collections.sort(statistics);
		
		int sum = 0;
		
		for(i=0;i<n;i++) {
			sum += statistics.get(i);
		}
		double temp = (double)sum / n;
		System.out.println(Math.round(temp));
		
		if(n <= 2) {
			System.out.println(statistics.get(n-1));
		}
		else {
			System.out.println(statistics.get(n/2));
		}
		
		
		int freqmax = 0;
		int freq_equal = 0;
		
		for(i=0;i<freqCheck.length;i++) {
			if(freqmax < freqCheck[i]) {
				freqmax = freqCheck[i];
			}
		}
		
		ArrayList<Integer> freq = new ArrayList<Integer>();
	
		for(i=0;i<freqCheck.length;i++) {
			if(freqCheck[i] == freqmax) {
				freq.add(i);
			}
		}
		
		Collections.sort(freq);
		
		if(freq.size() > 1) {
			System.out.println(freq.get(1) - 4000);
		}
		else {	
			System.out.println(freq.get(0) - 4000);
		}
		
		int range = statistics.get(n-1) - statistics.get(0);
		System.out.println(range);
	}
}