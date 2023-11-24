import java.util.Scanner;

public class Soal03 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int tinggiSegitiga = in.nextInt();

        for (int i = 0; i <= tinggiSegitiga; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= tinggiSegitiga - i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
