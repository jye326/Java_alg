package alg10773;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<BigInteger> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp != 0) {
                stack.push(BigInteger.valueOf(temp));
            } else {
                stack.pop();
            }
        }
        BigInteger sum = stack.stream().reduce(BigInteger.ZERO, BigInteger::add);
        System.out.println(sum);
    }
}
