package Operator;

public class OperatorLogika {
    public static void main(String[] args) {
        // &&, ||, !

        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // false, karena b adalah false
        System.out.println("a || b: " + (a || b)); // true, karena a adalah true
        System.out.println("!a: " + (!a)); // false, karena a adalah true dan kita membalik nilai dengan NOT
        System.out.println("a && !b: " + (a && !b)); // true, karena a adalah true dan !b (NOT b) adalah true
    }
}
