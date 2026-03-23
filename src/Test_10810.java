import java.util.Scanner;

/*  https://www.acmicpc.net/problem/10810 */
public class Test_10810 {

    // 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니를 총 N개 가지고 있음
        int M = sc.nextInt(); // M번 공을 넣는다.

        int[] basket = new int[N]; // 바구니 생성
        
        for (int i = 0; i < M; i++) {
           // 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // index는 0번 부터 시작하므로 배열 번호 조정(a~b)
            for (int j = a - 1; j < b; j++) {
                basket[j] = c; // 바구니 index 자리에 공 번호 투입 
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}