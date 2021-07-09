import java.lang.*;
import java.util.*;
public class Main {
	 
	
	static int judged_distance(int x1, int y1, int r1, int x2, int y2, int r2) {
		double d = 0;
	    int bigger, smaller = 0;
	    if(r2 > r1) {
	    	bigger = r2;
	    	smaller = r1;
	    }
	    else if(r1 > r2) {
	    	bigger = r1;
	    	smaller = r2;
	    }
	    else {
	    	bigger = r1;
	    	smaller = r2;
	    }
	    if(x1 == x2 && y1 == y2) {
	    	if(r1 == r2) {
	    		return -1;
	    	}
	    	else {
	    		return 0;
	    	}
	    }
	    if (x1 == x2)                
			d = Math.abs(y1 - y2);
		else if (y1 == y2)
			d = Math.abs(x1 - x2);
		else
		{
			d = Math.sqrt(((x1 - x2)* (x1 - x2)) +((y1 - y2)* (y1 - y2)));
		}
	    if(d>(r1+r2) || (bigger - smaller) > d) {
	    	return 0;
	    }
	    else if (d == (r1+r2)|| (bigger - smaller) == d) {
	    	return 1;
	    }
	    else {
	    	return 2;
	    }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int testcase = scan.nextInt();
        List <Integer> testmodel = new ArrayList<Integer>();
		while(i<testcase) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			testmodel.add(judged_distance(x1,y1,r1,x2,y2,r2));
			i++;
			}
		
		for(i = 0;i<testcase;i++) {
			System.out.println(testmodel.get(i));
		}
	}
}
