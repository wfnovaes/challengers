package algorithm.balancedSymbol;

import java.util.Stack;

public abstract class BalanceSymbolsValidador {


    public static boolean validade(String expression) {

        String OPEN_SYMBOLS = "[({<";
        String CLOSE_SYMBOLS = "])}>";
        Stack<Character> openStack = new Stack<>();

        for (int index = 0; index < expression.length(); index++) {
            char c = expression.charAt(index);
            if(OPEN_SYMBOLS.indexOf(c) >= 0) {
                openStack.push(c);
            }
            else if (CLOSE_SYMBOLS.indexOf(c) >= 0) {
                if (openStack.isEmpty()) return false;

                if (CLOSE_SYMBOLS.indexOf(c) == OPEN_SYMBOLS.indexOf(openStack.peek())) {
                    openStack.pop();
                } else {
                    return false;
                }
            }
        }
        return openStack.isEmpty();
    }
}
