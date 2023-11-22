package d3prob;

/*
한 정수를 입력받는다.
이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서,
몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
한번만 거듭제곱해도 본래 숫자가 되면 결과는 1이다.
 */

import java.util.Scanner;

public class H5Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int num = scanner.nextInt();   // 정수 입력

        int original = num; // 원래의 숫자를 기억하기 위한 변수
        int count = 0; // 거듭제곱 횟수를 카운트하기 위한 변수

        while (true) {
            num *= num; // 숫자를 제곱하여 갱신
            num %= 10; // 1의 자리 숫자만 남기기 위한 연산
            count++;

            if (num == original || num == 0 || num == 1) {
                System.out.println("원래의 숫자의 1의 자리 숫자가 같아지는 거듭제곱 횟수" + count);
                break;
            }
        }

    }
}
