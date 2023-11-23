package d4prob;

/*
현재 오전 7시이다.
정수 n을 인자로 받아서,
n 시간 후 12시까지 표기된 시계에서
시침이 어떤 숫자 위에 있는지를 반환하는 메서드를 작성하시오.
단, 입력이 0 <= n <= 127 를 벗어나면 -1을 반환하시오.
 */

public class H2Methods {
    public static void main(String[] args) {
        int n = 5;
        int handPosition = getHandPosition(n);
        if (handPosition != -1) {
            System.out.println(n + "시간 후 시침 위치: " + handPosition);
        } else {
            System.out.println("유효하지 않은 입력");
        }
    }
    public static int getHandPosition(int n) {
        if (n < 0 || n > 127) {
            return -1; // 범위를 벗어난 입력 처리
        }

        int hour = (7 + n) % 12; // 12시간 단위로 계산
        if (hour == 0) {
            return 12; // 12시는 시계상 12 위치에 있음
        } else {
            return hour;
        }
    }
}
