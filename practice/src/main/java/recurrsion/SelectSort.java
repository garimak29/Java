package recurrsion;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectSort {
    public static void sortIterative(ArrayList<Integer> arr) {
        // find minimum and place it in the begining of the list

        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            min = Integer.MAX_VALUE;
            minIndex = -1;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < min) {
                    min = arr.get(j);
                    minIndex = j;
                }
            }
            if (min < arr.get(i)) {
                int temp = arr.get(i);
                arr.set(i, min);
                arr.set(minIndex, temp);
            }

        }
        System.out.println(arr);
    }

    public static void sortRecurrsive(ArrayList<Integer> arr, int i, int j, int min, int minIndex) {
        // find minimum and place it in the begining of the list
        if (i == 0) {
            System.out.println(arr);
            return;
        }
        if (j < arr.size()) {
            if (arr.get(j) < min) {
                min = arr.get(j);
                minIndex = j;
            }
            sortRecurrsive(arr, i, j + 1, min, minIndex);
        } else {
            int k = arr.size() - i;
            if (min < arr.get(k)) {
                int temp = arr.get(k);
                arr.set(k, min);
                arr.set(minIndex, temp);
            }
            min = Integer.MAX_VALUE;
            minIndex = -1;
            sortRecurrsive(arr, i - 1, k + 1, min, minIndex);
        }


    }

    public static void sortRecurrsive1(ArrayList<Integer> arr, int r, int c, int max) {
        // find maximum and place it in the end of the list
        if (r == 0) {
            System.out.println(arr);
            return;
        }
        if ( c<r) {
            if (arr.get(c) > arr.get(max)) {
               sortRecurrsive1(arr , r , c+1 , c);
            }
            else
                sortRecurrsive1(arr , r , c+1 , max);

        } else {


                int temp = arr.get(max);
                arr.set(max, arr.get(r-1));
                arr.set(r-1, temp);

            sortRecurrsive1(arr, r - 1, 0, 0);
        }


    }




    public static void main(String[] args) {
        sortIterative(new ArrayList<Integer>(Arrays.asList(4, 2, 5, 6, 1, 2)));
        sortRecurrsive(new ArrayList<Integer>(Arrays.asList(4, 2, 5, 6, 1, 2)), 6, 0, Integer.MAX_VALUE, -1);
        sortRecurrsive1(new ArrayList<Integer>(Arrays.asList(4, 2, 5, 6, 1, 2)), 6, 0, 0);
    }
}
