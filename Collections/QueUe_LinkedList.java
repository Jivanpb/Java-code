package Collections;
import java.util.*;
public class QueUe_LinkedList {
    public static void main(String[] args) {
        //Queue<Integer> queue = new Queue<Integer>();
        //queue is an interface so we cannot create object of queue

        //System.out.println("here we implement Queue interface and create object of LinkedList()");
        Queue<Integer> queue = new LinkedList<Integer>();
        //System.out.println(" queue object created!");

        // add() and offer() method do same work in simple words
        // we say that these two method is to add value or element in queue on object
        queue.add(10);
        queue.offer(20);
        queue.offer(15);
        queue.add(50);
        System.out.println(" Here we add 4 element in Queue"+queue);

        //System.out.println(" Here we use Remove Queue "
        //        +queue.remove());
        // this method remove first element in a queue
        //System.out.println(" so here queue "+queue);

        //queue.remove(20);
        // this is method is remove specify element in queue we pass element here
        //System.out.println(queue);

        queue.poll();
        //this method remove first element in queue
        System.out.println("Here we remove first element "
                +queue);


        System.out.println("here we which element we remove  "
                +queue.peek());

    }
}
