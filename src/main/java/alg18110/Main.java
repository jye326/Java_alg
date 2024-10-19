package alg18110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cut = (int) round((float)N * 0.15);
        int sum = 0;

        // countingSort해야겠구만
        int[] cnt = new int[31];

        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(br.readLine());
            cnt[temp]++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=1;i<31;i++){
            while(cnt[i]>0){
                arr.add(i);
                cnt[i]--;
            }
        }
        for(int i=cut;i<N-cut;i++){
            sum+=arr.get(i);
        }
        System.out.println((int)round((float)(sum) / (float)(N-2*cut)));
    }
}
