import java.util.Scanner;

 

public class Main {

    static int N, M;

    static int[] answer;

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);

        N= scan.nextInt();

        M= scan.nextInt();

        answer= new int[M];
        func(0, 0);

    }

    

    public static void func(int index, int now) {
        if(index==M) {
             for(int i=0; i<M; i++) {
                 System.out.print(answer[i]+" ");
             }
             System.out.println();
             return;
         }

        for(int i=now+1; i<=N; i++) {
             answer[index]=i;
             func(index+1, i);
         }
    }//end func

}
