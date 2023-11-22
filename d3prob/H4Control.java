package d3prob;

/*
3명의 사람들에 대한 정보가
개행문자로 구분된 이름(문자열)이 세번
개행문자로 구분된 체온(정수)이 세번
입력된다.
이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
 */

import java.util.Scanner;

public class H4Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // 이름 입력
//        System.out.println("첫번째 사람의 이름을 입력하세요: ");
//        String name1 = scanner.nextLine();
//        System.out.println("두번째 사람의 이름을 입력하세요: ");
//        String name2 = scanner.nextLine();
//        System.out.println("세번째 사람의 이름을 입력하세요: ");
//        String name3 = scanner.nextLine();
//
//        System.out.println("첫번째 사람의 체온을 입력하세요: ");
//        double temp1 = scanner.nextDouble();
//        System.out.println("두번째 사람의 체온을 입력하세요: ");
//        double temp2 = scanner.nextDouble();
//        System.out.println("세번째 사람의 체온을 입력하세요: ");
//        double temp3 = scanner.nextDouble();
//
//        if (temp1 > 38) {
//            System.out.println(name1);
//        }
//        if (temp2 > 38) {
//            System.out.println(name2);
//        }
//        if (temp3 > 38) {
//            System.out.println(name3);
//        }

        String[] names = new String[3];
        double[] temps = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 사람의 이름을 입력하세요: ");
            names[i] = scanner.nextLine();

            System.out.println((i + 1) + "번째 사람의 체온을 입력하세요: ");
            temps[i] = scanner.nextDouble();
            scanner.nextLine(); // 개행 문자 처리
        }

        System.out.println("체온이 38도를 넘는 사람들");

        for (int i = 0; i < 3; i++) {
            if (temps[i] > 38) {
                System.out.println(names[i]);
            }
        }
    }
}
