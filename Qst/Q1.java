package Qst;

/*
어떤 야구단의 승, 무승부, 패가 입력된다.
이 야구단의 승률 (승 / (승 + 패))를, 소숫점 세번째 자리 까지, 아래와 같이 출력하여라.
86승 2무 56패 승률: 0.606
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Win = scanner.nextInt();
        int Draw = scanner.nextInt();
        int Lose = scanner.nextInt();

        double winRate = (double) Win / (Win + Draw + Lose);  // 승률 계산
        // 소숫점 셋째 자리까지 출력
        System.out.printf("%d승 %d무 %d패 승률: %.3f%n", Win, Draw, Lose, winRate);
    }
}
