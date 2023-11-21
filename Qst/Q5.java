package Qst;

/*
Scanner 이외의 변수를 한개만 선언하여
정수 A를 입력받아,
A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("정수 A를 입력하세요 : ");
        int A = scanner.nextInt();

        int square = A * A % 10; // A의 제곱의 1의자리  ( 나누고 남은 나머지 )
        int fourthPower = square * square % 10;
        int eighthPower = fourthPower * fourthPower % 10;

        System.out.println("A^2의 1의 자리 : " + square);
        System.out.println("A^4의 1의 자리 : " + fourthPower);
        System.out.println("A^8의 1의 자리 : " + eighthPower);
    }
}
