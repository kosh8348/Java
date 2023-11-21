package Qst;

/*
두 정수 A와 B가 입력될 때,
A가 B로 나누어 떨어지는지를 true 또는 false로 출력하여라.
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A를 입력하세요 :");
        int A = scanner.nextInt();
        System.out.print("B를 입력하세요 :");
        int B = scanner.nextInt();

        boolean result = A % B == 0;
        System.out.println("A가 B로 나누어 떨어지는지 :" + result);
    }
}
