package prg12980;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(5000));
    }

    public static int solution(int n) {
        /*
         * 후진도 없는 문제에 bfs를 쓰면 오래걸린다.
         * 그냥 주어진 수를 2로 나누는데 나머지가 1이 있다 -> +1 q+1하면 도착하니까
         * 2로 몇번 나누어야 0이 되는지 세는 문제!
         */

//        int count = 0;
//        while (n != 0) {
//            if (n % 2 == 0) {
//                n = n / 2;
//            } else {
//                count += 1;
//                n = (n - 1) / 2 ;
//            }
//        }
//        return count;

        // 미친 풀이가 있었다.
        return Integer.bitCount(n);
    }
}
