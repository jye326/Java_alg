package alg1676;

import java.util.Scanner;
/*
 * N! 뒤에서부터 0이 아닌 수가 나올때까지 등장하는 0의 갯수
 * 처음에는 5가 등장할때마다 0이 늘어나겠네! 해서 5로 나눈 몫이랑 같나?
 * 아님! 25의 경우 5가 2번 등장한 것! 따라서 5의 거듭제곱들도 고려해야 함.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // N의 범위가 500이하이므로 5, 25, 125로 나눈 몫을 고려해야 함
        System.out.println(N/5 + N/25 + N/125);
    }
}
