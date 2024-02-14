package Operator;

public class OperatorAssignment {
    public static void main(String[] args) {
        int a = 10;
        int hasil = 20;

        hasil += a; // hasil = hasil + a
        System.out.println(hasil);
        
        hasil -= a; // hasil = hasil - a
        System.out.println(hasil);
        
        hasil *= a; // hasil = hasil * a
        System.out.println(hasil);
        
        hasil /= a; // hasil = hasil / a
        System.out.println(hasil);
        
        hasil %= a; // hasil = hasil % a
        System.out.println(hasil);
    }
}