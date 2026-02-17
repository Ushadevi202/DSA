import java.util.*;
class DuplicateParanthesis{
    public static void main(String args[]){
        String str="(((x))+z)";
        System.out.println(checkduplicate(str));
        
    }

    public static boolean checkduplicate(String str){
        Stack<Character> stack=new Stack<Character>();

        for (char ch:str.toCharArray()) {
            if(ch!=')') {
                stack.push(ch);
            }
            else{
                char top=stack.pop();
                boolean operator=false;

                while (top!='(') {
                    if (top=='+'|| Character.isAlphabetic(top)) {
                        operator=true;
                    }
                    
                    top=stack.pop();
                }

                if (!operator) {
                    return true;
                }
            } 
        }

        return false;
    }

    public static boolean checkduplicate1(String str){

        int c=0,c1=0,i=0;
        while(i<str.length()){
            if(str.charAt(i)=='('){
               
                while(str.charAt(i)=='('){
                    c++;

                }
                
            }
            else{
                c=0;
            }
            if(str.charAt(i)==')'){
                c1++;
            }
            else{
                c1=0;
            }
            if( c>c1){
                return true;
            }
            i++;

        }
        return false;
    }
    

}