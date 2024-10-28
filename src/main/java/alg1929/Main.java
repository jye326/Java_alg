package alg1929;

import java.util.Scanner;

// 소수 구하기
// M이상 N이하의 소수를 모두 출력
// 에라토스테네스의 체
public class Main {
    public static void main(String[] args) {
        boolean[] table = new boolean[1000001];
        for (int i = 2; i < 1000001; i++) {
            table[i] = true;
        }
        for (int i = 2; i < 1000001; i++) {
            if (table[i]) {
                for (int j = 2; i * j < 1000001; j++) {
                    table[i * j] = false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = M; i <= N; i++) {
            if (table[i]) {
                System.out.println(i);
            }

        }
    }
}
