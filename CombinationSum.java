class CombinationSum{
    public static void main(String args[]){
        int[] arr={2,3,5};
        int target=10;
        System.out.println(combinationsum(arr,target));
    }
    public static int combinationsum(int[] arr,int target){
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int num:arr){
                if(i-num>=0){
                    dp[i]+=dp[i-num];
                }
            }
        }
        return dp[target];
    }
}