import java.util.Scanner;

public class MergeStringAlternatively {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter String1:");
        String s1 = sc.nextLine();
        System.out.print("Enter String2:");
        String s2 = sc.nextLine();

        System.out.println(mergestring(s1,s2));


    }

    private static String mergestring(String s1, String s2) {

        String result="";
        int i=0,j=0;

        while(i<s1.length() && j<s2.length()){
            result+=s1.charAt(i);
            result+=s2.charAt(j);
            i++;
            j++;
        }
        while(i<s1.length() ){
            result+=s1.charAt(i);
            i++;

        }
        while(j<s2.length() ){
            result+=s2.charAt(j);
            j++;

        }

        return result;
    }
}
