/*  
 * https://www.acmicpc.net/problem/1157
 */

import java.util.Arrays;
import java.util.Scanner;

/* 
* char 타입이 어떤 기능을 하는지 추가적으로 정리 필요
*/
public class Main_1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 알파벳은 26개이므로 각 자리에 인덱싱을 하도록 26개의 배열 만듦
        int[] temp = new int[26];

        String lowerCase = s.toLowerCase();

        // char로 변환하여 'a'와 제거하여 알파벳 자리를 숫자로 구해서 temp의 인덱스 위치를 더함
        for (int i = 0; i < lowerCase.length(); i++) {
            int calc = lowerCase.charAt(i) - 'a';
            temp[calc]++;
        }

        int max = Arrays.stream(temp).max().getAsInt();
        long count = Arrays.stream(temp).filter(n -> n == max).count();

        if (count == 1) {
            for (int i = 0; i < 26; i++) {
                // 알파벳 배열과 최대 값의 수가 일치한다면 대문자로 출력하도록 char 타입으로 변환
                if (temp[i] == max) {
                    System.out.println((char) ('A' + i));
                }
            }
        } else {
            System.out.println("?");
        }

        sc.close();
    }
}