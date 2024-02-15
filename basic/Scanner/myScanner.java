package Scanner;

import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
        Scanner input_user = new Scanner(System.in); // membuat objek scanner

        System.out.print("Masukkan Nama Anda: ");
        String name = input_user.next();
        System.out.println("Nama Anda Adalah: " + name);

        System.out.print("Masukkan angka: ");
        int number = input_user.nextInt();
        System.out.println("Angkanya Adalah: " + number);

        System.out.print("Masukkan angka pertama: ");
        int a = input_user.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input_user.nextInt();
        System.out.println(String.format("%d + %d = %d", a, b, a + b));

        input_user.close(); // menutup scanner
    }
}