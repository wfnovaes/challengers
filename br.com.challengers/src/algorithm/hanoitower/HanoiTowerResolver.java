package algorithm.hanoitower;

import java.util.Stack;

public abstract class HanoiTowerResolver {

    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destiny = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        resolve(original.size(), original, destiny, auxiliar);
    }

    public static void resolve(int n, Stack<Integer> original, Stack<Integer> destiny, Stack<Integer> auxiliar) {
        if (n > 0) {
            resolve(n-1, original, auxiliar, destiny);
            destiny.push(original.pop());
            System.out.println("-----");
            System.out.println("Origin: " + original);
            System.out.println("Destiny: " + destiny);
            System.out.println("Auxiliar: " + auxiliar);
            resolve(n-1, auxiliar, destiny, original);
        }
    }

}
