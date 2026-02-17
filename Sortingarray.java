class Sortingarray{
    public static void main(String args[]){
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,4};

        sort(arr1,arr2);
        sorting1(arr1,arr2);

    }

    public static void sort(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        while(i<arr1.length){
            System.out.print(arr1[i]+" ");
                i++;

        }
        while(j<arr2.length){
            System.out.print(arr2[j]+" ");
                j++;

        }

    }

    public static void sorting1(int[] arr1,int[]arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int minvalue=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr1.length;i++){
            minvalue=arr1[i];
            for(int j=0j<arr2.length;j++){
                if(minvalue>arr2[j]){
                    minvalue=arr2[j];
                    arr2[j]=0;

                }

            }
            arr[index++]=minvalue;
        }

    }
}