import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

 

public class Main {

    static int N, M;

    static int[] answer;

    public static void main(String [] args) throws IOException{
        Scanner scan= new Scanner(System.in);
        N= scan.nextInt();
        M= scan.nextInt();
        answer= new int[M];
        
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        func(0, 0, bw);
        bw.flush();
    }

    public static void func(int index, int now, BufferedWriter bw) throws IOException {
        if(index==M) {
             for(int i=0; i<M; i++) {
            	   bw.write(answer[i]+" ");
             }
             bw.write("\n");
             return;
         }

        for(int i=1; i<=N; i++) {
             answer[index]=i;
             func(index+1, i, bw);
         }
    }//end func

}
