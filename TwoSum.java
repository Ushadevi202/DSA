import java.util.Arrays;

public class TwoSum {

    public  static  void main(String args[]){
        int[] arr={4,6,8,1,9};
        int target=10;
        System.out.println(Arrays.toString(twosum(arr, target)));

    }
    public  static  int[] twosum(int[] arr,int target){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }
}
