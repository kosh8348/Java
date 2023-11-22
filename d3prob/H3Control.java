package d3prob;

/*
1인치는 2.54 센티미터이다.
사용자에게 정수를 두개 입력받는다.
첫번째 정수가 0이라면 두번째 정수는 센티미터이고,
첫번째 정수가 1이라면 두번째 정수는 인치이다.
센티미터는 해당 길이의 인치로, 인치는 해당 길이의 센티미터로 소수점 2째 자리까지 출력하여라.
 */

import java.util.Scanner;

public class H3Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요. :");
        int first = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요. :");
        double second = scanner.nextDouble();

        if (first == 0) {
            double inches = second / 2.54;   // 센티미터를 인치로 변환
            System.out.printf("%.2f 센티미터는 %.2f 인치입니다.", second, inches);
        } else if (first == 1) {
            double centimeters = second * 2.54; // 인치를 센티미터로 변환
            System.out.printf("%.2f 인치는 %.2f 센티미터입니다.", second, centimeters);
        } else {
            System.out.println("올바른 값을 입력하세요 (0 또는 1)");
        }
    }
}
