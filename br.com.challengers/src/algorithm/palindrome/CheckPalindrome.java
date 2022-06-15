package algorithm.palindrome;

import datastructure.stack.MyStack;

import java.util.stream.IntStream;

public abstract class CheckPalindrome {

    public static boolean check(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }

    public static boolean checkUsingStack(String word) {
        MyStack<Character> charStack = new MyStack<>();
        IntStream.range(0, word.length())
                .forEach(index -> charStack.push(word.charAt(index)));
        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            sb.append(charStack.pop());
        }
        return word.equals(sb.toString());
    }
}
