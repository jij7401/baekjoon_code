import java.lang.*;
import java.util.*;

public class pro_1436 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = 666;
		int result = 0;
		int T;
		int cnt = 0;
		
		 while(cnt < n){
		        result = temp;
		        while(result >= 100){
		            if(result%10 == 6){
		                result = result/10;
		                if(result%10 == 6){
		                    result = result/10;
		                    if(result%10 == 6){
		                        result = result/10;
		                        cnt++;
		                        T = temp;
		                    }
		                }
		            }
		            result = result/10;
		        }
		        temp++;
		    }
			System.out.println(temp-1);

	}
	
}