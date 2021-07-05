import java.util.*;
import java.lang.*;
import java.io.*;
public class pro_2822{
	static int grade[];
	static int check[];
	static int min = 151;
	static int temp=0;
	public static void main( String[] args ) {
	      Scanner scan = new Scanner(System.in);
	      grade = new int[8];
	      check = new int[8];
	      int sum = 0;
	      
	      for(int i=0;i<8;i++) {
	    	  grade[i] = scan.nextInt();
	      }
	      
	    find_grade(3);  
	    Arrays.sort(check);
	    for(int i=0;i<8;i++) {
	    	if(grade[i] <= 150) {
	    		sum+=grade[i];
	    	}
	    }
	    System.out.println(sum);
	    for(int i = 3; i<8;i++)
	      System.out.print(check[i]+" ");
	   }

	static void find_grade(int n) {

		if(n == 0) {
			for(int i=0;i<8;i++) {
				check[i] = i+1;
				if(grade[i] >= 151) {
					check[i] = -1;
				}
			}
			return;
		}
		else {
			for(int i = 0; i<8; i++) {
				if(min > grade[i]) {
					min = grade[i];
				}
			}
			for(int i=0; i<8;i++) {
				if(grade[i] == min) {
					temp++;
					grade[i] = 151+temp;
				}
			}
			min = 151;
		}
		find_grade(n-1);
	}
}
