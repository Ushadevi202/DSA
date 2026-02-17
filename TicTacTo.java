import java.util.*;
class TicTacTo{
    public static void main(String args[]){
        int[][] matrix=new int[4][4];
        
       
       tictactoe(matrix);
    }
    public static void tictactoe(int[][] matrix){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int n=matrix.length;
        int m=matrix[0].length;
        while(i<m*n){
            if(i%2==0){
                System.out.println("Player 1 turn(Enter 1):");
                int row=sc.nextInt();
                int col=sc.nextInt();
                if(matrix[row][col]==0){
                   matrix[row][col]=1;
                   i++;
                   
                }
                

             }
            else{
                System.out.println("Player 2 turn(Enter 2):");
                int row=sc.nextInt();
                int col=sc.nextInt();
                if(matrix[row][col]==0){
                matrix[row][col]=2;
                i++;
                }

            }
            
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
         int r=0;
         int count=0;
        //whose win
        while(r<matrix[0].length ){
            int j=r;
            count=0;
            for(i=0;i<matrix[0].length-1;i++){
                if(matrix[j][i]==matrix[j][i+1] && matrix[j][i]!=0){
                    count++;

                }
                else{
                    break;
                }
                
            }
                if(count==matrix.length-1){

                    System.out.println("Player "+matrix[j][i]+" wins");
                    return;
                    
                }
                
            for(i=0;i<matrix.length-1;i++){
                if(matrix[i][j]==matrix[i+1][j] && matrix[i][j]!=0){
                    count++;

                }
                else{
                    break;
                }
                
                }
                if(count==m-1){
                     System.out.println("Player "+matrix[i][j]+" wins");
                     return;
                    
                }
                r++;

            }    

            //diagnol check
            i=0;
            int j=0;
            while(i<n-1){
                if(matrix[i][j]==matrix[i++][j++] && matrix[i][j]!=0){
                    count++;

                }
                if(count==m-1){
                     System.out.println("Player "+matrix[i][j]+" wins");
                     return;
                    
                }
            }
            while(j>=0 && i<=m){
                
            }
    }
}





            /*
            if(matrix[i][0]==matrix[i][1] && matrix[i][1]==matrix[i][2] && matrix[i][0]!=0){
                System.out.println("Player "+matrix[i][0]+" wins");
                return;
            }
            else if(matrix[0][i]==matrix[1][i] && matrix[1][i]==matrix[2][i] && matrix[0][i]!=0){
                System.out.println("Player "+matrix[0][i]+" wins");
                return;
            }
            
            r++;
            }
            if(matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2] && matrix[0][0]!=0){
                System.out.println("Player "+matrix[0][0]+" wins");
                return;
            }
            else if(matrix[0][2]==matrix[1][1] && matrix[1][1]==matrix[2][0] && matrix[0][2]!=0){
                System.out.println("Player "+matrix[0][2]+" wins");
                return;
            }
            */
    