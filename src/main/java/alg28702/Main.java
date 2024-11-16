package alg28702;

/*
 *  입력 3개중에 숫자가 온다? -> 바로 4번째 문자열에 숫자 출력(규칙에 따라)
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(br.readLine());
        }
        checkInput(arr);
    }

    private static void checkInput(ArrayList<String> arr) {
        int ret = 0;
        for (int i = 0; i < arr.size(); i++) {
            try{
                ret = Integer.parseInt(arr.get(i));
                ret += (3 - i);
                System.out.println(printFizzBuzz(ret));
                return;
            } catch (NumberFormatException e) {
                //
            }
        }
    }

    // 숫자에 따라 FizzBuzz 출력
    private static String printFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
