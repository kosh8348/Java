package d3prob;

/*
ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
이때, 범위 밖의 입력이 들어오면 "잘못된 입력입니다"를 출력하여라.
 */

import java.util.Scanner;

public class Q1Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (0 < n && n < 27) {
            System.out.println((char) (64 + n));
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        // 0 ~ 30: 좋음
        // 31 ~ 80: 보통
        // 80 ~ 150: 나쁨
        // 151 ~ : 매우 나쁨
        int dust = 155;
        if (dust < 30) {
            System.out.println("좋음");
        } else if (dust <= 80) {  // dust > 30은 무조건 성립
            System.out.println("보통");
        } else if (80 < dust && dust <= 150) {
            System.out.println("나쁨");
        } else {
            System.out.println("매우 나쁨");
        }
    }
}
