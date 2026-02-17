import java.util.*;
class CAFES{
    public static void main(String args[]){
        String s1="suriya",s2="jothkia";
        System.out.println("Output:"+cafes(s1,s2));
        
    }
    public static StringBuilder cafes(String s1,String s2){
        String name="";
        StringBuilder cafes= new StringBuilder("CAFES");
        int i=0,j=0;
        
        while(i<s1.length()){
            if(!s2.contains(String.valueOf(s1.charAt(i)))){
                name+=s1.charAt(i);
                }
            i++;
        }
        
        while(j<s2.length()){
            if(!s1.contains(String.valueOf(s2.charAt(j)))){
                name+=s2.charAt(j);

            }
            j++;
        }
        System.out.println(name);
        int num=name.length();
        System.out.println(num);

        i=1;j=0; 
        while(cafes.length()>1){

            if(i==num){
                System.out.println(cafes.charAt(j));
                cafes.deleteCharAt(j);
                i=1;
            }
            else{
                j++;
                i++;
            }
            if(j>=cafes.length()){
                    j=0;
                }
                
        }
            
            return cafes;
    }
}