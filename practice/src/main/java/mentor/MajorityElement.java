package mentor;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement{

    public static int naiveMajorityElement(int[] arr){
        Map<Integer , Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int majorityElement = 0;
        // base case 
        if(arr.length == 1){
            return arr[0];
        }
        // assuming majority element always exist this condition can be avoided
        /*else if (arr.length == 2)
        {
            return 0;
        }*/
        else {
            for(int i =0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i] , map.get(arr[i])+1);
                
                if(map.get(arr[i]) > max){
                    max = map.get(arr[i]);
                    majorityElement = arr[i];
                }
                
            }
                else
                {
                    map.put(arr[i] , 1);
                }
                
            }
            
            if(max > arr.length/2)
                return majorityElement;
        }
        return 0;
    }
     public static void main(String []args){
        int arr[] = {2 ,2 ,1 ,1 ,1 ,2 ,2};
        System.out.println(naiveMajorityElement(arr));
     }
}
