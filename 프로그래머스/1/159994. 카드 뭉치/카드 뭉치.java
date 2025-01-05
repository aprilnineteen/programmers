import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static final String ANSWER_IS_NO = "No";
    private static final String ANSWER_IS_YES = "Yes";

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cardsQueue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardsQueue2 = new LinkedList<>(Arrays.asList(cards2));

        for (String s : goal) {
            if (!cardsQueue1.isEmpty() && s.equals(cardsQueue1.peek())) {
                cardsQueue1.poll();
                continue;
            }
            if (!cardsQueue2.isEmpty() && s.equals(cardsQueue2.peek())) {
                cardsQueue2.poll();
                continue;
            }
            return ANSWER_IS_NO;
        }
        return ANSWER_IS_YES;
    }
}