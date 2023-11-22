package d3prob;

/*
한 정수를 입력받는다. 이 정수는 잔고이다.
이후 반복해서 인출할 돈을 정수로 계속 입력받는다.
인출한 결과를 "성공: 잔고"의 형태로 출력하고,
잔고가 부족할 경우 "잔고가 부족합니다". 라고 출력 뒤 프로그램을 종료하여라.
 */

import java.util.Scanner;

public class Q5Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("잔고를 입력해주세요: ");
        int bank = scanner.nextInt();
        while (true) {
            System.out.println("인출할 돈을 입력해주세요 :");
            int price = scanner.nextInt();

            if (price < 0) {
                break; // 음수가 입력되면 반복 종료
            }

            if (price <= bank) {
                bank -=price; // 인출한 금액을 잔고에서 차감
                System.out.println("성공: " + price + ", 잔고: " + bank);
            } else {
                System.out.println("잔고가 부족합니다.");
                break; // 잔고 부족 시 반복 종료
            }
        }
    }
}
