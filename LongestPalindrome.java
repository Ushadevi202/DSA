class LongestPalindrome{
    public static void main(String args[]){

        String str="abcmadammom";
        System.out.println(longpalindrome(str));

    }

    public static String longpalindrome(String str){
        String result="";
        boolean palindrome=false;
        String substr="";
        //int maxlen=0;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                 substr=str.substring(i,j+1);
                
                int m=0,n=substr.length()-1; 
                while(m<n){
                    if(substr.charAt(m)!=substr.charAt(n)){
                        palindrome=false;
                        break;
                    }
                    else{
                        palindrome=true;
                    }
                    m++;
                    n--;

                }
                }

                if(palindrome && result.length()<substr.length()){
                    result=substr;
                    //maxlen=Math.max(maxlen,substring.length());
                }
            }
        }
        return result;
    }
}