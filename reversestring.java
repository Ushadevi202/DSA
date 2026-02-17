class reversestring{
    public static void main(String args[]){
        String str="Maze ";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String res="";
        for(int j=str.length()-1;j>=0;j--){
            res+=str.charAt(j);
        }
        return res;
    }
}