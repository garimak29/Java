package recurrsion;

import java.util.ArrayList;

public class RotatedBinarySearch {
    public static int search(ArrayList<Integer> arr , int target){
        int index = -1;
        index = search(arr , 0 , arr.size() , target);
        return index;
    }

    private static int search(ArrayList<Integer> arr, int s, int e, int target) {
      /*  int mid = s + (e-s)/2;
        if(arr.get(mid) == target)
            return mid;
        if(arr.get(s) == target)
            return s;
        if(arr.get(e) == target)
            return e;
        // 5 ,6,7,8,1,2,3,4 -- 7
        if(target >arr.get(mid)  && target>arr.get(s)){
           search(arr , s, mid -1 ,target );
        }
        // 5,6,7,1,2,3,4 --7
        else if(target > arr.get(mid) )*/
            return 0;
    }
}
