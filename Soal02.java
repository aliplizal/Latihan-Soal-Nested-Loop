import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int panjang = in.nextInt();

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
