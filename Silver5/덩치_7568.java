import java.util.*;
import java.lang.*;

public class pro_7568 {
	
	
	static void compareBulk(int[][] person, int people_count) {
		int bulk_count = 0;
		int i = 0;
		int k = 0;
        
        for(i=0;i<people_count;i++) {
        	int rank = 1;
			for(k=0;k<people_count;k++) {
				if(person[i][0] < person[k][0] && person[i][1] < person[k][1]) {
					rank++;
				}
		    }
			System.out.print(rank+" ");
        }	
			
	
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int people_count = scan.nextInt();
		int i = 0;
		int[][] person = new int[people_count][2];
		
		for(i=0;i<people_count;i++) {
			person[i][0] = scan.nextInt();
			person[i][1] = scan.nextInt();
		}
				
		compareBulk(person,people_count);
	}
}

