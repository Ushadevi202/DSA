
class LeadersOftheArray {

    public  static  void main(String args[]){
        int[] arr={1,7,4,5,5,1};
        System.out.println(leadersarray(arr));
    }

    public static String leadersarray(int[] arr) {

        StringBuilder res=new StringBuilder();
        int max=0;

        for(int i=arr.length-1;i>=0;i--) {
            if (max < arr[i]) {
                max = Math.max(max, arr[i]);
                res.insert(0, max+" ");

            }
        }
        return res.toString();
    }
}
