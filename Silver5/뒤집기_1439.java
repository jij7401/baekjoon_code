import java.util.*;
import java.io.*;

public class pro_1439{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		int i;
		int count1 = 0;
		int count2 = 0;
		String[] arr1 = s.split("1");
		String[] arr2 = s.split("0");
		
		Arrays.sort(arr1);
	    Arrays.sort(arr2);
		
	    for(i=0;i<arr1.length;i++) {
	    	if(arr1[i].isEmpty()){
	    		continue;
	    	}
	    	else {
	    		count1++;
	    	}
	    }
	    
	    for(i=0;i<arr2.length;i++) {
	    	if(arr2[i].isEmpty()){
	    		continue;
	    	}
	    	else {
	    		count2++;
	    	}
	    }
		
		
	    
	    if(count1 > count2) {
			System.out.println(count2);
		}
		else {
			System.out.println(count1);
		}
			
				
		
		
	}

}
