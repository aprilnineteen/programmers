public class Solution {

    // 10초 전: 사용자의 "prev" 명령 입력 시 재생 위치의 10초 전으로 가고, 10초 미만은 0분 0초로
// 10초 후: 사용자의 "next" 명령 입력 시 재생 위치의 10초 후로 가고, 남은 시간 10초 미만은 마지막 위치로
// 오프닝 건너뛰기: x >= op_start && x <= op_end 경우 오프닝 끝나는 위치로 이동

//video_len = 동영상 길이 문자열
// pos = 기능 수행 전 재생 위치
// op_start = 오프닝 시작 시각 문자열
// op_end = 오프닝 끝나는 시각 문자열
// commands = 사용자 입력 1차원 배열
// 단, 사용자 입력 종류 후 동영상 위치는 mm:ss 형식으로 return 가능하게 solution 완성

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