import java.util.*;
class prefixcalculation{
    public static void main(String args[]){
        String s1="-9*21";
        //System.out.println(prefixcal(s1));
        System.out.println(prefixcalculator(s1));
    }
    public static int prefixcal(String s1){
        Stack<Integer> seen=new Stack<Integer>();
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            if(Character.isDigit(ch)){
                seen.push(ch-'0');
            }
            else if(ch=='+'){
                int val1=seen.pop(),val2=seen.pop();
                int res=val1+val2;
                seen.push(res);
            }
            
            else  if(ch=='-'){
                int val1=seen.pop(),val2=seen.pop();
                int res=val2-val1;
                seen.push(res);

            }
            else if(ch=='*'){
                int val1=seen.pop(),val2=seen.pop();
                int res=val1*val2;
                seen.push(res);

            }
            else if(ch=='/'){
                int val1=seen.pop(),val2=seen.pop();
                int res=val2/val1;
                seen.push(res);

            }
            }
            return seen.pop();

        }

        public static int prefixcalculator(String s1){
            String demo="";
            int result=s1.charAt(s1.length()-1)-'0',res2=0;
            int j=0;
            for(int i=s1.length()-2;i>=0;i--){
            char ch=s1.charAt(i);
            if(Character.isDigit(ch)){
                //res2=(ch-'0');
                demo+=ch;
                }
            else if(ch=='+'){    
                
            res2=(demo.charAt(j)-'0');
            result+=res2;
            System.out.println(result);
            j++;
            }

            else if(ch=='-'){
            res2=(demo.charAt(j)-'0');
            result-=res2;
            System.out.println(result);
            j++;

            }   
            else if(ch=='*'){
                res2=(demo.charAt(j)-'0');
                result*=res2;
                System.out.println(result);
                j++;
            }
            else if(ch=='/'){
                res2=(demo.charAt(j)-'0');
                result/=res2;
                System.out.println(result);
                j++;
            }



            /*else if(ch=='+'){
                result+=res2;

            }   
            else if(ch=='-'){
                result-=res2;

            }    
            else if(ch=='*'){
                result*=res2;
            }
            else if(ch=='/'){
                result/=res2;
            }
            */
        }
        return result;
            }
        
        
    }

