package alg11650;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            StringTokenizer st = new StringTokenizer(temp);
            int[] pair = new int[2];
            pair[0] = Integer.parseInt(st.nextToken());
            pair[1] = Integer.parseInt(st.nextToken());
            list.add(pair);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i)[0] + " " + list.get(i)[1] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

