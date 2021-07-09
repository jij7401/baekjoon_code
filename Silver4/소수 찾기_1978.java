import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{

	   static int[] prime;
	   public static boolean isPrime( int n ) {

	      for( int i = 2; i <= (int)Math.sqrt( n ); ++i ) {
	         if( n % i == 0 ) {
	            return false;
	         }
	      }
	      return true;
	   }


	   public static void main( String[] args ) throws IOException{
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      prime = new int[n];
	      for(int i=0;i<n;i++) {
	    	  prime[i] = scan.nextInt();
	      }
          int count = 0;
	      for( int i = 0; i < n; ++i ) {	        
	            if( isPrime( prime[i] ) ) {
	               count++;
	            }
	            if(prime[i] == 1) {
	            	count-=1;
	            }

	      }
	      System.out.print(count);
	   }
	}
