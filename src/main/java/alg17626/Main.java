package alg17626;

import static java.lang.Math.min;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50001];
        arr[0] = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i= 1;i<=n;i++){
            arr[i] = arr[i-1]+1;
            for(int j = 0;j*j<=i;j++){
                arr[i] = min(arr[i], arr[i-j*j]+1);
            }
        }
        System.out.println(arr[n]);
    }
}