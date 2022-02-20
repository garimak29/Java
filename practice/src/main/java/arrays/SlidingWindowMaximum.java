package arrays;

import java.util.*;

public class SlidingWindowMaximum {

    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dequeue = new LinkedList<>();
        dequeue.add(0);
        int i;
        if(B>A.size())
            return res;
        // calculate the max queue for the first B integers
        for( i =1;i<B;i++){
            if(dequeue.isEmpty())
                dequeue.add(i);
            if(A.get(i)<= A.get(dequeue.peek()) && !dequeue.isEmpty() ){
                dequeue.add(i);
            }
            else
                dequeue.removeLast();
                dequeue.add(i);
        }
    //    System.out.println(dequeue);
        //insert the value in res and at the same time move the window
        for(;i<A.size();i++){
            if(dequeue.isEmpty())
                dequeue.add(i);
            if(A.get(i)<= A.get(dequeue.peekLast()) && !dequeue.isEmpty() ){
                dequeue.add(i);
            }
            res.add(A.get(dequeue.peek()));
            dequeue.remove(); // always remove the top as this will be the max
        }
        if(!dequeue.isEmpty() ){
            res.add(A.get(dequeue.peek()));
        }
        return res;
    }
    public static ArrayList<Integer> slidingMaximum1(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });
        for(int i=0;i<A.size();i++){
            queue.add(A.get(i));
            if(i>=B-1){
                res.add(queue.peek());
                queue.remove(A.get(i-B+1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
      /*  ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(slidingMaximum(arr , 3));*/
        /*ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        System.out.println(slidingMaximum(arr1 , 1));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1));
        System.out.println(slidingMaximum(arr2 , 1));
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList( 251, 286, 420, 491, 506, 34, 716, 829, 615, 53, 807, 837, 750, 650, 181, 140, 543, 944, 210, 113, 551, 379, 818, 817, 227, 525, 257, 735, 932, 172, 410, 935, 351, 347, 521, 168, 482, 885, 612, 352));
        System.out.println(slidingMaximum(arr3 , 9));*/
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368 ));
        System.out.println(slidingMaximum(arr4 , 9));
    }
}
