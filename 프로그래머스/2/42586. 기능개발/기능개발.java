import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> result = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int remainDays = (remain + speeds[i] - 1) / speeds[i];
            result.add(remainDays);
        }

        List<Integer> days = new ArrayList<>();
        int countFeatures = 1;
        int day = result.poll();

        while (!result.isEmpty()) {
            if (day < result.peek()) {
                days.add(countFeatures);
                countFeatures = 1;
                day = result.poll();
            } else {
                countFeatures++;
                result.poll();
            }
        }
        
        days.add(countFeatures);

        return days.stream().mapToInt(i -> i).toArray();
    }
}