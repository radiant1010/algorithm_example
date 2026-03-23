import java.util.Scanner;

/*  https://www.acmicpc.net/problem/10813 */
public class Test_10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니를 총 N개 가지고 있고
        int M = sc.nextInt(); // M번 공을 바꾼다

        int[] basket = new int[N]; // 바구니 생성

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        // Arrays.stream(basket).forEach(System.out::println);

        for (int i = 0; i < M; i++) {
            // 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다.
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;

            int temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}