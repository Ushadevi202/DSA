class Matrixsubsum{
    public static void main(String args[]){
        int[][] matrix={{0,0,0,0},{0,0,-1,4},{0,0,0,0},{0,0,0,0}};
         int row=matrix[0].length;
        int col=matrix.length;
        //System.out.println(maxsum(matrix));
        maxsubsum(matrix,4,4);
    }

    public static int maxsum(int[][] matrix){
        int col=matrix[0].length;
        int row=matrix.length;
        int sum=0,max=0;

        for(int i=0;i<row-1;i++){
            for(int j=0;j<col-1;j++){
                sum=0;
                for(int m=i;m<i+(row-1);m++){
                    for(int n=j;n<j+(col-1);n++){
                        sum+=matrix[m][n];


                       
                    }
                     if(sum>max){
                            max=sum;
                        }
                }
            }
        }
        return max;
}

public static int maxsubsum(int[][] matrix,int row,int col){

    
       int sum=0,max=0,sum1=0,num=2;

    
    for(int i=0;i<row/2;i++){
        for(int j=0;j<col/2;j++){
            sum=0;
            for(int m=i;m<i+num;m++){
                for(int n=j;n<j+num;n++){
                    sum+=matrix[m][n];
                    sum1=0;
                    for(int a=m;a<m+2;a++){
                        for(int b=n;b<n+2;b++){
                            sum1+=matrix[a][b];
                        }

                    }
                }
            }
           

            if(sum1>max){
                if(sum>max){
                max=sum;
                }
                else{
                    max=sum1;
                }
            }
        }
    }

   
   
    return sum;
   
    }


}