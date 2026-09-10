import java.util.*;
class LongestSubstringWORepeatingChar{
    public static void main(String[] args){
        String str="nhohjdjanskrhbq";
        System.out.println(longestSubstring(str));
    }
    public static String longestSubstring(String str){
        String s="";
        String res="";
        for(int i=0;i<str.length();i++){
            if(!s.contains(String.valueOf(str.charAt(i)))){
                s+=str.charAt(i);
            }
            else{
                if(res.length()<s.length()){
                    res=s;
                }
                s="";
                s+=str.charAt(i);

            }
        }
        if(res.length()<s.length()){
                    res=s;
                }

        return res;
    }
}