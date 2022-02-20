package arrays.twoDArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDeterminant {
    static int find(ArrayList<ArrayList<Integer>> arr){
        int res = 0;
        if(arr.size() == 2){
            res = arr.get(0).get(0)*arr.get(1).get(1) - arr.get(0).get(1)*arr.get(1).get(0);
        }
        else if (arr.size() == 3){
            res = arr.get(0).get(0)*(arr.get(1).get(1)*arr.get(2).get(2) - arr.get(1).get(2)*arr.get(2).get(1))
                    - (arr.get(0).get(1)*(arr.get(1).get(0)*arr.get(2).get(2) - arr.get(1).get(2)*arr.get(2).get(0)))
                + arr.get(0).get(2)*(arr.get(1).get(0)*arr.get(2).get(1) - arr.get(2).get(0)*arr.get(1).get(1));
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,2)));
        arr.add(new ArrayList<>(Arrays.asList(3,4)));
        System.out.println(find(arr));
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        arr1.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arr1.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arr1.add(new ArrayList<>(Arrays.asList(7,8,9)));
        System.out.println(find(arr1));
    }

}
