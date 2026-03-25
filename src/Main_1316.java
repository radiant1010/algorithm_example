package src;
/*  
 * https://www.acmicpc.net/problem/1316
 */

import java.util.Scanner;

public class Main_1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCnt = sc.nextInt();

        int answer = 0;

        for (int i = 0; i < inputCnt; i++) {
            String s = sc.next();
            // 연속되는 문자열 1개로 합쳐주기(ex. ssssza -> sza)
            String result = s.replaceAll("(.)\\1+", "$1");

            int[] lockString = new int[26];
            int j = 0;

            for (j = 0; j < result.length(); j++) {
                int calc = result.charAt(j) - 'a';
                lockString[calc]++;

                if (lockString[calc] > 1) {
                    break;
                }
            }

            if (j == result.length()) {
                answer++;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}