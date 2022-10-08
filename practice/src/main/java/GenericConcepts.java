
public class GenericConcepts<T> {
    public T[] reverseArray(T[] arr){
        int i=0, j=arr.length-1;
        T temp;
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

    public void print(T[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        String[] strArr = {"Apple","Bat","cat","Dog"};
        GenericConcepts genericConcepts = new GenericConcepts();
        genericConcepts.print(genericConcepts.reverseArray(arr));
        genericConcepts.print(genericConcepts.reverseArray(strArr));
    }
}
