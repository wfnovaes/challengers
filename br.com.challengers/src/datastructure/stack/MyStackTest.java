package datastructure.stack;

import java.util.Arrays;

public class MyStackTest {

    public static void main(String[] args) {
        stackTest();
    }

    public static void stackTest() {
        MyStack<Integer> stack = new MyStack<>();
        int[] numbers = new int[] {1,2,3,4,5,10,22,26,1000};
        Arrays.stream(numbers)
                .forEach(number -> {
                    if (number % 2 == 0) stack.push(number);
                    else if (stack.isEmpty()) System.out.println("The stack is empty!");
                    else stack.pop();
                });
        System.out.println("Stack in the final: " + stack);
        while (!stack.isEmpty()) {
            System.out.println("Stack pop: " + stack.pop());
        }
    }
}
