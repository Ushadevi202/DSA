class WatterBottle{
    public static void main(String args[]){
        int numBottles=9,numExchange=3;
        System.out.println(watterbottle(numBottles,numExchange));

    }

    public static int watterbottle(int numBottles,int numExchange){
        int sum=numBottles;
        while(numBottles>=numExchange){
            int newBottles=numBottles/numExchange;
            sum+=newBottles;
            numBottles=newBottles+(numBottles%numExchange);
        }
        return sum;
    }

}