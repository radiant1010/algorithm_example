/*  
 * https://www.acmicpc.net/problem/2444
 */

import java.util.Scanner;

public class Main_2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 2 * n - 1;
        int start = max % 2 != 0 ? max : max - 1;

        for (int i = 1; i <= max; i += 2) {
            int spaces = (max - i) / 2;
            String blank = " ".repeat(spaces);
            String stars = "*".repeat(i);
            System.out.println(blank + stars);
        }
        for (int i = start - 2; i >= 1; i -= 2) {
            int spaces = (max - i) / 2;
            String blank = " ".repeat(spaces);
            String stars = "*".repeat(i);
            System.out.println(blank + stars);
        }
        sc.close();
    }
}