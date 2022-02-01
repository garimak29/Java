package recurrsion;



import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void sortIterative(ArrayList<Integer> arr ){
        for(int i =0;i<arr.size();i++){
            for(int j=0;j<arr.size()-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

        System.out.println(arr);
    }


    public static void sortRecurssive(ArrayList<Integer> arr  , int i , int j){
       if(i==0){
           System.out.println(arr);
           return;
       }

       if(j<i) {
           if ( (j+1 < arr.size()) && arr.get(j) > arr.get(j + 1) ) {
               int temp = arr.get(j);
               arr.set(j, arr.get(j + 1));
               arr.set(j + 1, temp);
           }
           sortRecurssive(arr, i, j + 1);
       }
       else
           sortRecurssive(arr , i-1 , 0);


     //   System.out.println(arr);
    }
    public static void main(String[] args) {
        sortIterative(new ArrayList<>(Arrays.asList(1,3,2,5)));
        sortRecurssive(new ArrayList<>(Arrays.asList(1,3,2,5,2,4,9)),7,0);
    }
}
