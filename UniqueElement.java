import java.util.HashMap;

public class UniqueElement {
    public  static  void main(String[] args) {
        int[] arr = {4, 6, 8, 4, 6, 6, 1, 1, 4,8,9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                System.out.println(i);
            }

        }
    }
}
