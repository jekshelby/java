package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        // ++ incremnet menambahkan satu nilai
        int a = 10;
        System.out.println("Nilai a : " + a++); // 10 karena duluan variabel daripada increment (post-increment)
        System.out.println("Nilai a sekarang : " + a); // lalu baru 11

        // -- decrement mengurangi satu niali
        int b = 5;
        System.out.println("Nilai b : " + --b); // 4 karena duluan decrement (pre decrement)
        System.out.println("Nilai b sekarang: " + b); //4
        
    }
}