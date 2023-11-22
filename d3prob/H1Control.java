package d3prob;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/*
한 정수를 입력받아,
해당 정수가 음수인지 양수인지 아니면 0인지 출력하는 코드를 작성하여라.
 */
public class H1Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("해당 숫자는 양수입니다.");
        } else if (number < 0) {
            System.out.println("해당 숫자는 음수입니다.");
        } else {
            System.out.println("해당 숫자는 0입니다.");
        }
    }
}
