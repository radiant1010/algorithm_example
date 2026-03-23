import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*  
 * https://www.acmicpc.net/problem/3052
 */
public class Test_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] rest = new Integer[10];

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            rest[i] = n % 42;
        }
        // 배열안에 다른 숫자가 몇개나 있는지 찾는법
        // HashSet을 사용하면 중복을 제거
        HashSet<Integer> set = new HashSet<>(Arrays.asList(rest));

        System.out.println(set.size());
        sc.close();
    }
}