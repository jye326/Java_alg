package alg2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 1000000000 int최댓값이 이걸 담나? long으로 담을 수 있음.
         * long으로 계산하고 /10을 10번만 하면 끝나는 작업
         * 그래도 속도가 중요할 것 같으니 일단 bf사용하자.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long A = Long.parseLong(br.readLine());
        Long B = Long.parseLong(br.readLine());
        Long C = Long.parseLong(br.readLine());
        int[] arr = new int[10];
        Long mul = A * B * C;
        // mul 을 10으로 나눈 값이 0 -> 1~9라는 뜻.

        while (mul / 10 > 0) {
            // 10으로 나눈 나머지
            long remain = mul % 10;
            arr[(int) remain] += 1;
            mul /= 10;
        }

        arr[(int) (mul % 10)]++;

        for (int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
