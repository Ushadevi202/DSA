import java.util.Arrays;
class Arrays1{
    public static void main(String args[]){
        int[] arr={0,1,3};
        System.out.println(Arrays.toString(findMissing(arr)));
    }
    public static int[] findMissing(int[] arr){
        int n=arr.length;
        int sum=(n*(n+1))/2;
        int sum1=0;
        for(int i:arr){
            sum1+=i;
        }
        System.out.println(sum-sum1);
        return arr;
    }
}