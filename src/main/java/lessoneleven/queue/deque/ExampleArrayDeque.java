package lessoneleven.queue.deque;

import java.util.ArrayDeque;

public class ExampleArrayDeque {
    //FIFO - first input, first output

    public static void main(String[] args) {
        ArrayDeque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("One");
        stringDeque.add("Two");
        stringDeque.add("Three");

        System.out.println(stringDeque);
        stringDeque.addFirst("Four");
        stringDeque.addLast("Five");
        System.out.println(stringDeque);

        System.out.println(stringDeque.pollFirst());
        System.out.println(stringDeque.pollLast());
        System.out.println(stringDeque.poll());
        System.out.println(stringDeque.poll());
        System.out.println(stringDeque.poll());

        //stringDeque.addFirst();
    }
}
