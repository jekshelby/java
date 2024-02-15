import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        int tern = ( angka > 5 ) ? 1 : 0;
        System.out.println(tern);

        input.close();
    }
}
