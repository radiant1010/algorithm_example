package src;
/*  
 * https://www.acmicpc.net/problem/2941
 */

import java.util.Scanner;

public class Main_2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String pattern = "dz=|c=|c-|d-|lj|nj|s=|z=";
        String result = s.replaceAll(pattern, "*");

        /*
         * 착각한 지점 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
         * 이유 : 1개의 알파벳은 영어가 아니라 크로아티아 문자열임. 
         * 따라서 * 갯수 + 남은 알파벳을 출력해야함
         */
        System.out.println(result.length());
        sc.close();
    }
}