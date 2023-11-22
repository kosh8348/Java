package d3prob;

/*
어떤 학생의 시험점수가 정수로 주어진다.
점수가 90점 이상이면 "수",
점수가 80점 이상 90점 미만이면 "우",
점수가 80점 미만이면 "미"
를 출력하여라.
 */

import java.util.Scanner;

public class Q2Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores = 99;
        if (100 >= scores && scores >= 90) {
            System.out.println("수");
        } else if (80 <= scores) {
            System.out.println("우");
        } else {
            System.out.println("미");
        }

        int zero = 0;
        if (zero == 0) {
            System.out.println("is zero");
        }
        else if (10 % zero == 0) {
            System.out.println("is factor");
        }
        else {
            System.out.println("not factor");
        }

        String input = scanner.nextLine();
        // (확인하고 싶은 값)
        switch (input) {
            case "w":   // input == "w"
                System.out.println("up");
                break;
            case "a":   // input == "a"
                System.out.println("left");
                break;
            case "s":   // input == "s"
                System.out.println("down");
                break;
            case "d":   // input == "d"
                System.out.println("right");
                break;
                // 기본동작, 필수 아님
            default:
                System.out.println("invalid");
        }

        switch (input) {
            case "w" ->
                    System.out.println("up");
            case "a" ->
                    System.out.println("left");
            case "s" ->
                    System.out.println("down");
            case "d" ->
                    System.out.println("right");
            default ->
                System.out.println("invalid");
        }

        // while
        // 대출금 천만원
        int loan = 1717;
        int months = 0;
        // 대출금 남았니?
        while (loan > 0) {
            loan -= 49;
            months++;
            System.out.println("남은 대출액:" + loan);
        }
        System.out.println("대출 상황 완료! 총 걸린 개월수:" + months);

        int[] numbers = {2, 3, 5, 6, 19, 23};
        int i = 0;
        int sum = 0;
        // 총합 및 평균 구하기

        while (i < 6) {
            System.out.println(numbers[i]);
            sum += numbers[i]; // 각 요소를 총합에 더함
            i++;
        }

        double average = (double) sum / numbers.length; // 평균 계산
        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);

    }
}
