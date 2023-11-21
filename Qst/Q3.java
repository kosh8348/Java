package Qst;

/*
ASCII 코드로 'A'는 65이다.
1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 26 사이의 숫자를 입력하세요 : ");
        int n = scanner.nextInt();

        // 입력된 숫자에 해당하는 알파벳을 구해서 출력
        char ch = (char) ('A' + n - 1);
        System.out.println("입력된 숫자에 대응하는 알파벳 : " + ch);
    }
}
