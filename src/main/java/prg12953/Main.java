package prg12953;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 2,6,8,14 }));
    }
    public static int solution(int[] arr) {
        int answer = 1;
        for (int i : arr) {
            answer =  lcm(answer, i);
        }
        return answer;
    }
    private static int gcd(int a, int b) {
        // 유클리드 호제법 이용
        // 1. a % b = r
        // 2. 나머지가 0 될 때까지, b % r 반복
        // 3. 나머지가 0 이 되었을때의 b가 최소공약수!
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
