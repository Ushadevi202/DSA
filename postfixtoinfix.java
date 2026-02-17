import java.util.*;
class postfixtoinfix{
    public static void main(String args[]){

        String s1="1234+*/";
        System.out.println(posttoin(s1));
        
    }

    public static StringBuilder posttoin(String s1){

        StringBuilder demo=new StringBuilder();
       

        for(int i=0;i<s1.length();i++){
            if(Character.isLetterOrDigit(s1.charAt(i))){
                demo.append(s1.charAt(i));
                

            }
            else{
                for(int j=demo.length()-1;j>0;j--){
                    char c1=demo.charAt(j);
                   
                    char c2=demo.charAt(j-1);
                   
                    if(Character.isLetterOrDigit(c1) && Character.isLetterOrDigit(c2)){
                        demo.insert(j,s1.charAt(i));
                        break;
                        }
                }
               
            }
        }
        return demo;          
          }
        }

     