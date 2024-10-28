package alg11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] stack = new boolean[21];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] action_and_num = br.readLine().split(" ");
            if (action_and_num.length == 2) {
                String action = action_and_num[0];
                int num = Integer.parseInt(action_and_num[1]);
                switch (action) {
                    case "add":
                        stack[num] = true;
                        break;
                    case "remove":
                        stack[num] = false;
                        break;
                    case "check":
                        if (stack[num]) {
                            bw.write("1");
                        } else {
                            bw.write("0");
                        }
                        bw.write("\n");
                        break;
                    case "toggle":
                        stack[num] = !stack[num];
                        break;
                }
            } else {
                String action = action_and_num[0];
                switch (action) {
                    case "all":
                        for (int j = 1; j < 21; j++) {
                            stack[j] = true;
                        }
                        break;
                    case "empty":
                        for (int j = 1; j < 21; j++) {
                            stack[j] = false;
                        }
                        break;
                }
            }
        }
        bw.flush();
    }
}
