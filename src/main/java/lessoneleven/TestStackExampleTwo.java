package lessoneleven;

import java.util.Stack;

public class TestStackExampleTwo {
    public static void main(String[] args) {
        int[] ints = {3, 4, 56, 6, 3, 4, 2, 5, 5, 7, 8};
        //handleInReverseOrder order = new handleInReverseOrder;


    }

    public void handleInReverseOrder(int...array){
        Stack<Integer> stack = new Stack<>();
        for (int element : array){
            stack.push(element);

        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }

    }
}
