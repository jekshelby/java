package ControlFlow;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();

        switch (umur) {
            case 10:
                System.out.println("Umur Anda 10 Tahun");
                break;
            case 11:
                System.out.println("Umur Anda 11 Tahun");
                break;
            case 12:
                System.out.println("Umur Anda 12 Tahun");
                break;
        
            default:
            System.out.println("Umur Tidak Terdaftar");
                break;
        }
        input.close();
    }
}
