class PaliPattern{
    public static void main(String args[]){
        int n=4,temp=0;
        for(int i=0;i<n*2;i++){

            if(i<n){


            for(int m=i;m<n;m++){
                System.out.print("  ");
            }
            int num=1;
            for(int j=0;j<(2*i)+1;j++){

                

                System.out.print(num+" ");

                
                if(j<i){
                    num++;
                }
                else{
                    num--;
                }

            }
            System.out.println();
            }
            else if(i==n){
                 temp=n+1;
            }
            else{

                for(int space=1;space<=i-n+1;space++){
                    System.out.print("  ");
                }
                int num=1;
                for(int j=0;j<temp;j++){
                    System.out.print(num+" ");
                if(j<(temp/2)){
                    num++;
                }
                else{
                    num--;
                }
                

                }
                temp=temp-2;
                System.out.println();


                           }
        }
    }
}