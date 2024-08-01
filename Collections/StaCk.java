package Collections;
import java.util.*;

/*
Stack is follow last in first out
    Order maintain
    Duplicates are allowed in stack
    operations in stack
    1)push() use to add value in stack
    2)pop() use to deleting value in stack
    3)peek() use to highest value in stack

 */
  public class StaCk {
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<Integer>();
        System.out.println("here we use push() to add value in stack");
        stack.push(10);
        stack.push(02);
        stack.push(22);
        stack.push(22);
        System.out.println("the value in stack is " +stack);
        System.out.println("push() is done");
        System.out.println("here we use peek() to see highest value in stack");
        stack.peek();
        System.out.println("the value in stack is after use peek() " +stack);
        System.out.println("push() is done");
         stack.pop();
         stack.pop();
         stack.pop();
         stack.pop();
        System.out.println("here we use pop() to delete  values in stack");
        System.out.println(stack);

    }
}
