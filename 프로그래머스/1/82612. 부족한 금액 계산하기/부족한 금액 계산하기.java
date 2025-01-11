class Solution {
    public long solution(int price, int money, int count) {
        long totalMoney = 0;

        for (int i = 1; i <= count; i++) {
            totalMoney += (long) price * i;
        }

        return totalMoney > money ? totalMoney - money : 0;
    }
}