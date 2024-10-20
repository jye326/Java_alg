package alg1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // StringTokenizer인자로 readline()과 delimeter
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i< N; i++) {
            list.add(((double)Integer.parseInt(st.nextToken())));
        }
        // Collections.max(list)로 list 최댓값 추출
        double m = Collections.max(list);

        // 성적 고치기
        for (int i=0; i<N; i++) {
            
            list.set(i, list.get(i)/m * 100.0);
        }
        // 평균 구하기
        double sum = 0;
        for (double x : list){

            sum += x;
        }
        System.out.println(sum/N);
    }
}
