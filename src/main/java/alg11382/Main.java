package alg11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        long [] arr = new long[3];
        for(int i =0;i<3;i++){
            arr[i] = sc.nextLong();
        }
        long sum = 0;
        for(int i =0;i<3;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
