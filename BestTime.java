class BestTime{
    public static void main(String args[]){
        int[] arr={6,9,5,3,2,6,6,4};
        System.out.println(besttime(arr));
    }
    public static int besttime(int[] arr){
        int max1=0;
        int min1=1000000;
        int res=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i<j){
                min1=Math.min(min1,arr[i]);
                max1=Math.max(max1,arr[j]);
                res=Math.max(res,(max1-min1));
            }
            j--;

        }
        return res;
    }
}