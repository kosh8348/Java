package d2prob;

/*
현재 오전 7시이다.
n을 입력받아서,
n 시간 후 12시까지 표기된 시계에서
시침이 어떤 숫자 위에 있는지 구하시오.
0 <= n <= 127;
 */

import java.util.Scanner;

public class Q2Operators {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int time = 7;
        int n = scanner.nextInt();
        time += n;
        System.out.println(time % 12);
    }
}
