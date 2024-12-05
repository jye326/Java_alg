package prg12973;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() == c) {
                stack.pop();
            } else if (stack.peek() != c) {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
