public class FindMissingNumber {
    public  static  void  main(String[] args){
        int[] arr={6,4,2,1,3,7};
        System.out.println(missingnum(arr));
    }

    private static int missingnum(int[] arr) {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        //System.out.println(sum);
        for(int i:arr){
            sum-=i;
        }
        return  sum;
    }
}
