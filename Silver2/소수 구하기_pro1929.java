import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

   public static boolean isPrime( int n ) {

      for( int i = 2; i <= (int)Math.sqrt( n ); i++ ) {
         if( n % i == 0 ) {
            return false;
         }
      }
      return true;
   }

  

   public static void main( String[] args ) throws IOException{
      BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
      StringTokenizer st = new StringTokenizer( br.readLine() );

      int a = Integer.parseInt( st.nextToken() );
      int b = Integer.parseInt( st.nextToken() );

      for( int i = a; i <= b; i++ ) {

         if( isPrime( i ) ) {
             if(i == 1){
                 continue;
             }
               System.out.println( i );
            }
      } // end for
   }
}