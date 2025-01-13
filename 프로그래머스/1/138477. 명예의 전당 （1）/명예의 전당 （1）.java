import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hallOfFame = new int[k];

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hallOfFame[i] = score[i];
                Arrays.sort(hallOfFame, 0, i + 1);
            } else {
                if (score[i] > hallOfFame[0]) {
                    hallOfFame[0] = score[i];
                    Arrays.sort(hallOfFame);
                }
            }
            answer[i] = hallOfFame[0];
        }
        return answer;
    }
}