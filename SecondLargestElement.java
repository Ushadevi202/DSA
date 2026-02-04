public class SecondLargestElement {
    public  static  void main(String[] args){
        int[] num={1,5,8,9,4,7,19};
        System.out.println(largestelement(num));
    }
    public  static  int largestelement(int[] arr){
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(arr[i]>secondMax && firstMax!=arr[i]){
                secondMax=arr[i];
            }
        }
        return secondMax;

    }
}
