package ControlFlow;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();

        if (umur <= 5) {
            System.out.println("Balita");
        } else if (umur > 5 && umur <= 15) {
            System.out.println("Anak-anak");
        } else if (umur > 15 && umur <= 25) {
            System.out.println("Remaja");
        } else if (umur > 25 && umur <= 50) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Lansia");
        }

        input.close();
    }
}