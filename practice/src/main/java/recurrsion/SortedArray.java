package recurrsion;


import java.util.ArrayList;
import java.util.Arrays;


public class SortedArray {
    public static boolean checkIfSorted (ArrayList<Integer> arr){
        boolean res = true;
        res = check(res , arr , 0);
        return res;

    }

    private static boolean check(boolean res ,ArrayList<Integer> arr, int i) {
        if(i== arr.size()-1)
            return true;
        System.out.println(arr.get(i)+" -- "+arr.get(i+1)+" --"+i);
        if(arr.get(i)<arr.get(i+1) ){
            return res && check(res ,arr , i+1);
        }
        else
        return false;

      //  return true;

    }

    public static void main(String[] args) {
        System.out.println(checkIfSorted(new ArrayList<>(Arrays.asList(1,2,3,4))));
        System.out.println(checkIfSorted(new ArrayList<>(Arrays.asList(1,9,3,4))));
    }
}
