package arrays;

public class ArrayConcepts {

    /**
     * TimeComplexity : O(log N)
     * @param arr
     * @return array
     */

    public int[] reverseArray(int[] arr){
        int i=0, j=arr.length-1, temp;
        while(i<=j){
        //    System.out.println("count "+i);
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        return arr;
    }

    public void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayConcepts ac = new ArrayConcepts();
        ac.print(ac.reverseArray(arr));
    }

}
