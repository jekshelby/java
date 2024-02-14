package Operator;

public class OperatrorBitwise {
    public static void main(String[] args) {
        int a = 5; // 0101 dalam biner
        int b = 6; // 0110 dalam biner

        System.out.println("a & b: " + (a & b)); // 4 (0100 dalam biner)
        System.out.println("a | b: " + (a | b)); // 7 (0111 dalam biner)
        System.out.println("a ^ b: " + (a ^ b)); // 3 (0011 dalam biner)
        System.out.println("~a: " + (~a)); // -6 (di dalam biner, semua bit dari a dibalikkan)
        System.out.println("a << 2: " + (a << 2)); // 20 (dalam biner 10100)
        System.out.println("b >> 2: " + (b >> 2)); // 1 (dalam biner 0001)
        System.out.println("b >>> 2: " + (b >>> 2)); // 1 (dalam biner 0001)
    }
}

/* 
Operator Bitwise di Java:
& (AND bitwise): Melakukan operasi AND pada setiap bit dari dua operand.
Contoh: a & b
| (OR bitwise): Melakukan operasi OR pada setiap bit dari dua operand.
Contoh: a | b
^ (XOR bitwise): Melakukan operasi XOR pada setiap bit dari dua operand.
Contoh: a ^ b
~ (NOT bitwise atau complement): Membalikkan setiap bit operand (nilai positif menjadi negatif dan sebaliknya).
Contoh: ~a
<< (left shift): Menggeser bit-bit operand ke kiri sebanyak jumlah yang ditentukan.
Contoh: a << 2
>> (right shift): Menggeser bit-bit operand ke kanan sebanyak jumlah yang ditentukan, mempertahankan tanda.
Contoh: a >> 2
>>> (unsigned right shift): Menggeser bit-bit operand ke kanan sebanyak jumlah yang ditentukan, tanpa mempertahankan tanda.
Contoh: a >>> 2
 */