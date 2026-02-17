class palindrome{
    public static void main(String args[]){
        String s1="abcbar";
        System.out.println(checkpalindrome(s1));
    }

    public static boolean checkpalindrome(String s1){
        int left=0,right=s1.length()-1;
        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
        return true;
    }
}