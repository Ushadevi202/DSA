class numPattern{
    public static void main(String args[]){
        int n=4;
        int num=n*(n+1)/2;
        //System.out.println(num);
        for(int i=n;i>0;i--){
            num=i*(i+1)/2;
            //int out=num;
            for(int j=i-1;j<n;j++){
                System.out.print(num+" ");
                num=num+j+1;
            }
            
            System.out.println();
        }
    }
}