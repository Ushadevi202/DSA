class numPattern{
    public static void main(String args[]){
        int n=5;
        int temp=n,a=n;
        for(int i=1;i<(temp*2);i++){
            
            if(i<=n){
                for(int space=1;space<i;space++){
                    System.out.print(" ");
                }
            for(int j=i;j<=n;j++){
                
                System.out.print(j+" ");
            }
            }
            
            else{

            
                for(int space=a-2;space>0;space--){
                    System.out.print(" ");
                }
                a--;
                
            
                for(int j=n-1;j<=temp;j++){
                    System.out.print(j+" ");

                }
                n--;
            }

            System.out.println();

        }

        
    }
}