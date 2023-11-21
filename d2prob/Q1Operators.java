package d2prob;

import java.util.Scanner;

public class Q1Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[3];
        scores[0] = scanner.nextInt();
        scores[1] = scanner.nextInt();
        scores[2] = scanner.nextInt();
        // 나눗셈 직전에 피연산자 둘중 하나는 실수여야한다.
        // System.out.println(scores[0] + scores[1] + scores[2] / 3); // X
        // System.out.println((double) ((scroes[0] + scores[1] + scores[2]) / 3)); // X
    }
}
