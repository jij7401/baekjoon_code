import java.util.Scanner;

class Main {
    public static int[] memo;

    public static int tile(int n){
        if(n==1||n==0)
            memo[n]=1;
        if(memo[n]>0)
            return memo[n];
        memo[n]=(tile(n-1)+tile(n-2))%10007;
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        memo=new int[n+1];
        System.out.print(tile(n));
    }
}
