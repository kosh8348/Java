package d2prob;
/*
세개의 양의 정수 A, B, C를 입력받아서,
        A가 B와 C의 공배수인지를 true 또는 false로 출력하여라.

 */

import java.util.Scanner;

public class Q6Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        boolean isCommonMultiple = (A % B == 0 && A % C == 0);
        System.out.println(isCommonMultiple);


        // 비트 연산자
        // 11 = 0000 1011
        //  5 = 0000 0101
        // 비트연산 AND (&)
        System.out.println(11 & 5);
        // 비트연산 OR  (|) (SHIFT + \)
        System.out.println(11 | 5);
        // 비트연산 XOR (^)
        System.out.println(11 ^ 5);
        // 비트연산 NOT (~)
        System.out.println(~11);
        System.out.println(~5);
        // SHIFT 연산
        System.out.println(12 << 2);
        System.out.println(12 >> 1);
        System.out.println(-12 >> 1);
        System.out.println(-12 >>> 1);
        // int a가 짝수일 때 a & 1은 0
        // << == * 2, >> == / 2
        // ~a = -a -1

        // 미세먼지 수치
        // 80 이하면 좋음, 아니면 나쁨
        int dust = scanner.nextInt();
        String message = dust <= 80 ? "좋음" : "나쁨";
        System.out.println(String.format("미세먼지 수치: %d, (%s)", dust, message));
    }
}
