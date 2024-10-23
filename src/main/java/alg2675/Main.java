package alg2675;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String temp = br.readLine();
            StringTokenizer st = new StringTokenizer(temp, " ");
            int N = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for (int j = 0; j<S.length();j++){
                for (int k = 0; k<N; k++){
                    bw.write(S.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
