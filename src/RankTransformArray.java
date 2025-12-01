import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RankTransformArray {
    public int[] arrayRankTransform(int[] arr) {
        //store rank for  each number in arr
        TreeMap<Integer, List<Integer>> n = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(!n.containsKey(arr[i])){
                n.put(arr[i],new ArrayList<>());
            }
            n.get(arr[i]).add(i);
        }
        int rank = 1;
        for(int num :n.keySet()){
            for(int i :n.get(num)){
                arr[i] = rank;
            }
            rank++;
        }
        return  arr;
    }
}
