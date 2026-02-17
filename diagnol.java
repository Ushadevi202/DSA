class diagnol{
    public static void main(String args[]){
        
        int n=5;
         int num=n*(n/2)+1;
        for(int i=n;i>0;i--){
            int out=num;
            for(int j=i;j<=n;j++){
                System.out.print(out+" ");
                
                out=out+j+1;
                

            }
            
            num=num-i+1;
            System.out.println();
        }

        }

    }