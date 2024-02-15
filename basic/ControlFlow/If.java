package ControlFlow;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();

        if (umur < 18) {
            System.out.println("Umur di bawah 18 tahun");
        }

        input.close();
    }
}
