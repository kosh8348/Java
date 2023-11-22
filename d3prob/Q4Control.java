package d3prob;

/*
정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때,
n개의 이름을 입력된 순서의 반대로 출력하여라.
 */

import java.util.Scanner;

public class Q4Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 n을 입력하세요: ");
                // ex)
                // 3
                // Alex
                // Brad
                // Chad
        int n = scanner.nextInt();
        // 정수 입력 이후 개행 소모 용도
        scanner.nextLine();

        String[] names = new String[n];
        // 이름 입력 받기
        System.out.println("n개의 이름을 개행으로 입력하세요: ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine(); // 이름을 배열에 저장
        }
        // 이 시점에서 모든 이름을 받은 상태

        // 입력된 순서의 반대로 이름 출력
        System.out.println("입력된 순서의 반대로 출력:");
        for (int i = 0; i < n; i++) {
            // 0 ~ n - 1 까지 n개 임으로,
            // 제일 뒤에 있는 애는 n - 1에 있다.
            System.out.println(names[n - 1 - i]);
        }
    }
}
