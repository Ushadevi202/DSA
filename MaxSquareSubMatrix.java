 class MaxSquareSubMatrix {
    // if the arra is 4x4 then the max square sub matrix can be  all 3x3,2x2 example if my intput is[1,2,3,4][5,6,7,8][9,10,11,12][13,14,15,16]
// then i check for all 3x3 matrix [1,2,3][5,6,7][9,10,11] then [2,3,4][6,7,8][10,11,12] and so on for 2x2 matrix and check which one has the max sum
    public static void main(String args[]){
        int[][] matrix={{0,1,2,4},{10,11,0,0},{-2,1,0,0},{1,2,-1,-2}};
         int row=matrix[0].length;
        int col=matrix.length;
        System.out.println(maxSquareSubMatrix(matrix,row,col));
    
    }
    public static int maxSquareSubMatrix(int[][] matrix,int row,int col){
        int sum=0,max=0;

        for(int num=Math.min(row,col);num>=1;num--){
            for(int i=0;i<=row-num;i++){
                for(int j=0;j<=col-num;j++){
                    sum=0;
                    for(int m=i;m<i+num;m++){
                        for(int n=j;n<j+num;n++){
                            sum+=matrix[m][n];
                        }
                    }
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        return max;
    }
 }
 