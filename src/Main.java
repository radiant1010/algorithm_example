package src;
import java.util.Scanner;

/*  업로드용 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            check[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}