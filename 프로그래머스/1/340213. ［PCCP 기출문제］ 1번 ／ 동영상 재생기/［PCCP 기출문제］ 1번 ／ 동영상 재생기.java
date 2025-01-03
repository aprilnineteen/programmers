public class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = changeTimeFormat(video_len);
        int currentPos = changeTimeFormat(pos);
        int opStart = changeTimeFormat(op_start);
        int opEnd = changeTimeFormat(op_end);
        currentPos = opSkip(opStart, currentPos, opEnd);

        for (String command : commands) {
            if (command.equals("prev")) {
                currentPos = currentPos - 10;
                if(currentPos < 0) {
                    currentPos = 0;
                }
                currentPos = opSkip(opStart, currentPos, opEnd);
            }
            if (command.equals("next")) {
                currentPos = currentPos + 10;
                if(currentPos > videoLen) {
                    currentPos = videoLen;
                }
                currentPos = opSkip(opStart, currentPos, opEnd);
            }
        }

        return formatTime(currentPos);
    }

    private static int opSkip(int opStart, int currentPos, int opEnd) {
        if(opStart <= currentPos && opEnd >= currentPos) {
            currentPos = opEnd;
        }
        return currentPos;
    }

    private int changeTimeFormat(String times) {
        String[] time = times.split(":");
        int minutes = Integer.parseInt(time[0]);
        int seconds = Integer.parseInt(time[1]);
        return minutes * 60 + seconds;
    }

    private String formatTime(int time) {
        int minutes = time / 60;
        int seconds = time % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}