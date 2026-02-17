class ChesshorseMovement{
    public static void main(String args[]){

        int sr=2,sc=0,er=3,ec=2;
        
        if(checkhorsemovement(sc, sr, ec, er,"")){
            System.out.println("Path found");
        }
        else{
            System.out.println("No Path found");
        }
        

    }
    public static boolean checkhorsemovement(int sc,int sr,int ec,int er,String path){
        int[][] possiblemoves={{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        if(sr==er && sc==ec){
            path=path+sr+sc+" ";

            System.out.println(path);
            return true;
        }
        path=path+sr+sc+" ";

        for(int[] move:possiblemoves){
            int r=sr+move[0];
            int c=sc+move[1];
            if(r>=0 && r<=7 && c>=0 && c<=7 && !path.contains(r+""+c)){
                if(checkhorsemovement(c,r,ec,er,path)){
                    return true;
                }
            }
        }
        return false;
        
 
    }
}