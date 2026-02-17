import java.util.*;
class ValidExpression{
    public static void main(String args[]){
        String str="(ab+)";
        System.out.println(validexpressioncheck(str));
    }

    public static boolean validexpressioncheck(String str){
        Stack<Character> stack=new Stack<Character>();
        Character prevchar=' ';

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(prevchar==' ' || prevchar=='('||prevchar=='+'||prevchar=='*'){
                    return false;
                }
                stack.pop();
            }
            if(c=='+'||c=='*'){
                if(prevchar==' ' || prevchar=='('||prevchar=='+'||prevchar=='*'){
                    return false;
                }
            }
            prevchar=c;
        }
        return stack.isEmpty() && !(prevchar=='+'||prevchar=='*');
    }
}