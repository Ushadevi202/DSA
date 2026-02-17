class longestvowel{
    public static void main(String args[]){

        String str="compt";
        System.out.println(longestvowelcount(str));

    }
    public static int longestvowelcount(String str){
        String str1=str.toLowerCase();
        int count=0,j=0,c1=0,c=0;

        for(int i=0;i<str1.length();i++){

            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u' || str1.charAt(i)=='v' ){
                c1=i-(j+1);
                c++;
                j=i;

            }
            if(c1>count){
                count=c1;

            }
            //System.out.println(j);
            


        }
        
        return count;
    }
}