class RotateStr{
    public static void main(String args[]){
        String s1="abcd",s2="cdab";
        if((s1+s1).contains(s2) && s1.length()==s2.length()){
        int index=s1.indexOf(s2.charAt(0));
        if(index==0){
            System.out.println(-1);
        }
        else{
        
        System.out.println(index);
        }
        }
        

    }
}