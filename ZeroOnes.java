class ZeroOnes{

    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
            if(i%2!=0){
                if(j%2!=0){
                    System.out.print(3+" ");
                }
                else{
                    System.out.print(2+" ");
                }
            }
            else{
                if(j%2!=0){
                    System.out.print(2+" ");
                }
                else{
                    System.out.print(3+" ");
                }

            }
            }
            System.out.println();
        
        
        }
    }
    
}