package Collections;
import java.util.PriorityQueue;
public class PriorityQueUe {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        // here we reverse queue
        //PriorityQueue<Integer> pqueue = new PriorityQueue<>(Comparator.reverseOrder());
        pqueue.offer(12);
        pqueue.add(3);
        pqueue.offer(4);
        pqueue.add(5);
        pqueue.offer(2);
        // minimum element added first so this queue is ascending like
        System.out.println(pqueue);

        // peek() show first element in queue
        System.out.println( pqueue.peek());

        // poll() show first element in queue
        System.out.println(pqueue.poll());


    }
}
