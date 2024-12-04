package prg12911;

class Solution {
    public int solution(int n) {
        int now = count1(n);    // n의 현재 binary 1 갯수
        for (int i = n+1;true;i++) {
            if (count1(i) == now) {
                return i;
            }
        }
    }
    public int count1(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for (int i =0; i<binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count += 1;
            }
        }
        return count;
    }
}
