package Collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Deque is interface and ArrayDeque is class

        // element added method() in ArrayDeque class and Deque interface
        // offer() and offerFirst() do same thing
        deque.offerFirst(31);
        deque.offer(34);
        deque.offerFirst(36);
        deque.offerLast(42);
        System.out.println(deque);

      //element remove peek() in ArrayDeque class and Deque interface
        // peek() and peekFirst() do same thing
        //System.out.println("deque.peek() "+deque.peek());
        //System.out.println("deque.peekFirst() "+deque.peekFirst());
        //System.out.println("deque.peekLast() "+deque.peekLast());

      //element remove poll() in ArrayDeque class and Deque interface
        // poll() and pollFirst() do same thing
        //System.out.println("deque.poll() " +deque.poll());
        //System.out.println("deque.pollFirst() " +deque.pollFirst());
        //System.out.println("deque.pollLast() " +deque.pollLast());

    }
}
