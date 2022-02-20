package queue;

import java.util.Deque;
import java.util.LinkedList;

public class Alice {
    public static int solve(int A) {
        int res = 0;
        Deque<Integer> deque = new LinkedList<Integer>();
        for(int i =0;i<A;i++){
            deque.add(i+1);
        }
        while(deque.size() >1){
            deque.removeLast();
            int last = deque.removeLast();
            deque.addFirst(last);

        }
        res = deque.getFirst();

        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve(931433));
    }
}
