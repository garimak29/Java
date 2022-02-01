package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static boolean findElement(ArrayList<Integer> arr, int target) {
        boolean res = find(arr, 0, target);
        return res;
    }

    private static boolean find(ArrayList<Integer> arr, int i, int target) {
        if (i == arr.size())
            return false;
        if (arr.get(i) == target)
            return true;
        else
            return find(arr, i + 1, target);
    }

    public static int findIndex(ArrayList<Integer> arr, int target) {
        int index = findIndexElement(arr, 0, target);
        return index;
    }

    private static int findIndexElement(ArrayList<Integer> arr, int i, int target) {
        if (i == arr.size())
            return -1;
        if (arr.get(i) == target)
            return i + 1;
        else
            return findIndexElement(arr, i + 1, target);
    }


    private static ArrayList<Integer> findAllTarget(ArrayList<Integer> arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
      //  res = findAllTargetElement(arr, 0, target, res);
        res = findAllTargetElement2(arr, 0, target);
        return res;
    }

    private static ArrayList<Integer> findAllTargetElement(ArrayList<Integer> arr, int i, int target, ArrayList<Integer> res) {
        if (i == arr.size())
            return res;
        if (arr.get(i) == target)
            res.add(i + 1);

        return findAllTargetElement(arr, i + 1, target, res);

    }



    private static ArrayList<Integer> findAllTargetElement2(ArrayList<Integer> arr, int i, int target) {
      ArrayList<Integer> res = new ArrayList<>();
        if (i == arr.size())
            return res;
        if (arr.get(i) == target)
            res.add(i + 1);

         ArrayList<Integer> add = findAllTargetElement2(arr, i + 1, target);
         res.addAll(add);
         return res;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 5));
        //System.out.println(findElement(arr,5));
        //System.out.println(findIndex(arr , 5));
        System.out.println(findAllTarget(arr, 6));
     //   System.out.println(findAllTarget(arr, 6));
    }
}
