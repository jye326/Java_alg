package alg11651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] temp = new String[2];
            temp = br.readLine().split(" ");
            list.add(temp);
        }
        list.sort((o1, o2) -> {
            if (o1[1].equals(o2[1])) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
            return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
        });
        for (int i = 0; i < n; i++) {
            bw.write(list.get(i)[0] + " " + list.get(i)[1]+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
