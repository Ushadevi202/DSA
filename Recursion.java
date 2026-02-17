class Recursion{
    public static void main(String args[]){
        int num=4,sum=0;
        recursivesum(num,sum);
    }

    public static void recursivesum(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum=sum+num;
        recursivesum(num-1,sum);
    }
}