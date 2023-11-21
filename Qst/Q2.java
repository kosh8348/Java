package Qst;

/*
어떤 수 A와 B가 입력된다..
A를 B로 나눈 몫과 나머지를, "A = 몫 * B + 나머지"의 형태로 출력하여라.
예) A = 10, B = 3가 입력될때,
A = 3 * B + 1
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A를 입력하세요: ");
        int A = scanner.nextInt();
        System.out.print("B를 입력하세요: ");
        int B = scanner.nextInt();

        int quotient = A / B;  // 몫 계산
        int remainder = A % B;  // 나머지 계산
        System.out.printf("A = %d * %d + %d", quotient, B, remainder);
    }
}
