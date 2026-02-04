public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "sh)@ghsg";
        int[] count = new int[256];

        for(char c:s.toCharArray()){
            count[c]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                break;
            }
        }

    }
}
