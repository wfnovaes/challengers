package algorithm.balancedSymbol;

public class BalanceSymbolsValidatorTest {

    public static void main(String[] args) {
        System.out.println("Symbols from ([{<>}]): " + BalanceSymbolsValidador.validade("([{<>}])"));
        System.out.println("Symbols from A.B(123-32)*37: " + BalanceSymbolsValidador.validade("A.B(123-32)*37"));
        System.out.println("Symbols from A.B(123-32)*<37: " + BalanceSymbolsValidador.validade("A.B(123-32)*<37"));
        System.out.println("Symbols from 123{2132(1232)3123[213]}: " + BalanceSymbolsValidador.validade("123{2132(1232)3123[213]}"));
        System.out.println("Symbols from {}asdas)asdsa([123]: " + BalanceSymbolsValidador.validade("{}asdas)asdsa([123]"));
    }
}
