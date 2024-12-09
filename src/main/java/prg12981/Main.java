package prg12981;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] answer = solution(5,
                new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    static private int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int[] tryTime = new int[n]; // 각 n의 시도횟수
        ArrayList<String> before = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (pass(before, words[i])) {
                tryTime[i % n]++;
                before.add(words[i]);
            } else {
                answer[0] = (i % n) + 1;
                answer[1] = tryTime[i % n] + 1;
                return answer;
            }
        }
        return answer;
    }

    static private boolean pass(ArrayList<String> before, String word) {
        if (before.isEmpty()) {
            return word.length() > 1;
        }
        return !before.contains(word) &&
                word.length() > 1 &&
                word.charAt(0) == before.getLast().charAt(before.getLast().length() - 1);
    }
}
