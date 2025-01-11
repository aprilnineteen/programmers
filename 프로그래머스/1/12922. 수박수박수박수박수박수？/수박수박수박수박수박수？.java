class Solution {
    private static final String WATERMELON = "수박";
    private static final String WATERMELON_ODD = "수";
    
    public String solution(int n) {
        return WATERMELON.repeat(n / 2) + WATERMELON_ODD.repeat(n % 2);
    }
}