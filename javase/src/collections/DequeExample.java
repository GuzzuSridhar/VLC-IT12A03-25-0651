package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // Add elements to both ends
        deque.addFirst("Front1");
        deque.addLast("Rear1");
        deque.addFirst("Front2");
        deque.addLast("Rear2");

        System.out.println("Deque: " + deque);

        // Remove from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        System.out.println("Deque: " + deque);

        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

    }
}
// Implements the queue interface