package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AdjancyList {
    public static HashMap<Integer,ArrayList<Integer>> generateList(ArrayList<List<Integer>> arr){
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(!map.containsKey(arr.get(i).get(0))){
                map.put(arr.get(i).get(0),new ArrayList<>(Arrays.asList(arr.get(i).get(1))));
            }
            else{
                map.get(arr.get(i).get(0)).add(arr.get(i).get(1));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2));
        arr.add(Arrays.asList(2,3));
        arr.add(Arrays.asList(3,4));
        arr.add(Arrays.asList(4,5));
        arr.add(Arrays.asList(1,3));
        System.out.println(generateList(arr));


    }
}
