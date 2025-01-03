public class Solution {
    public int solution(String t, String p) {
        long P = Long.parseLong(p);
        int number_length = p.length();
        int count = 0;

        for (int i = 0; i < t.length() - number_length + 1; i++) {
            String T = t.substring(i, i + number_length);

            if (Long.parseLong(T) <= P) {
                count++;
            }
        }
        return count;
    }
}