import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new)));

        for (int i = 0; i < 10; i++) {
            if (!(set.contains(i))) {
                answer += i;
            }
        }
        return answer;
    }
}