package alg31403;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();
        String AB = A + B;
        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C));
        int ans = Integer.parseInt(AB) - Integer.parseInt(C);
        System.out.println(ans);
    }
}
