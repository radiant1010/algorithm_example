package src;
/*  
 * https://www.acmicpc.net/problem/3003
 */

import java.util.Scanner;

public class Main_3003 {

    public static void main(String[] args) {
        // 킹, 퀸, 룩, 비숍, 나이트, 폰 순서 고정
        int[] listTemplate = { 1, 1, 2, 2, 2, 8 };
        // 임시 저장
        int[] temp = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            temp[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print((listTemplate[i] - temp[i]) + " ");
        }
        sc.close();
    }
}