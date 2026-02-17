import java.util.Arrays;
class SetMatrixZeros{
    public static void main(String args[]){
        int[][] matrix ={
            {1,1,1},{1,0,1},{1,1,1}
        };
        System.out.println(Arrays.deepToString(setzero(matrix)));
    }
    public static int[][] setzero(int[][] matrix){
        int[][] temp = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            temp[i]=Arrays.copyOf(matrix[i],matrix[0].length);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    for(int k=0;k<matrix.length;k++){
                        temp[i][k]=0;
                    }
                    for(int k=0;k<matrix[j].length;k++){
                        temp[k][j]=0;
                    }
                }
                
            }
        }
        
        return temp;
    }
}