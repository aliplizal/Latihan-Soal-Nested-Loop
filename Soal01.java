import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int kolomAngka = in.nextInt();

        for (int baris = 1; baris <= kolomAngka; baris++) {

            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(baris);
            }

            System.out.println();
        }
    }
}
