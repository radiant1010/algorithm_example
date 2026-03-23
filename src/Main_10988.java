/*  
 * https://www.acmicpc.net/problem/10988
 */

import java.util.Scanner;

public class Main_10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String result = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(result) ? 1 : 0);
        sc.close();
    }
}