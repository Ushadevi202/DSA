import java.util.*;
class Climbing_Stairs{
    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no.of Stairs:");
        int n=sc.nextInt();
        System.out.println(climbingStairs(n));
    }

    public static int climbingStairs(int n){

        int[] DP=new int[n+1];
        DP[0]=1;
        DP[1]=1;

        if(n<=1){
            return 1;
        }

        for(int i=2;i<=n;i++){
            DP[i]=DP[i-1]+DP[i-2];
        }
        return DP[n];
    }
}