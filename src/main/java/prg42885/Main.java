package prg42885;



import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80}, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        // int[] -> List<Integer> 의 경우만 별도로 처리함
        List<Integer> peopleList = new ArrayList<>();
        for (int i : people) {
            peopleList.add(i);
        }
        Collections.sort(peopleList, Collections.reverseOrder());
        Deque<Integer> queue = new ArrayDeque<>(peopleList);
        while (!queue.isEmpty()) {
            int heavy = queue.removeFirst();
            if (!queue.isEmpty() && queue.peekLast() + heavy <= limit) {
                queue.removeLast();
            }
            answer++;
        }
        return answer;
    }
}
