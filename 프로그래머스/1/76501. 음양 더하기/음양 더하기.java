class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int totalAbsolutes = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                absolutes[i] = Math.abs(absolutes[i]);
            } else {
                absolutes[i] = -absolutes[i];
            }
            totalAbsolutes += absolutes[i];
        }
        return totalAbsolutes;
    }
}