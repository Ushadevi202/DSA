import java.util.*;

class TwoSum{
    public static void main(String[] args) {
        int[] arr={3,5,7,8,2,0,4,5,6};
        int target=2;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] nums,int target){

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{};


    }

}