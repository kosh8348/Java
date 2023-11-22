import java.awt.desktop.SystemEventListener;
import java.io.PrintStream;
import java.util.Scanner;

public class D3ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 나이를 입력받고, 나이가 20 미만일때 입장불가 출력
        int age = 19;
        if (age < 20) {
            System.out.println("입장불가");
            System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
        }

        int multiple = 2;
        // multiple이 2의 배수면, 2의 배수 출력
        if (multiple % 2 == 0) {
            System.out.println("2의 배수");
        }
        // multiple이 5의 배수면, 5의 배수 출력
        if (multiple % 5 ==0) {
            System.out.println("5의 배수");
        }
        // multiple이 10의 배수면, 10의 배수 출력
        if (multiple % 10 ==0) {
            System.out.println("10의 배수");
        }
        // 몇년인지 받는다.
        int year = 4;
        if (year % 4 ==0) {
            if (year % 100 != 0) {
                System.out.println("윤년이다");
            }
            if (year % 400 == 0) {
                System.out.println("윤년이다");
            }
        }

        // 2의 배수면 짝수 아니면 홀수
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        /*
        어떤 학생의 시험점수가 입력 되었을 때,
          80점을 넘으면 "Good Job"
          못넘으면 "Too bad"
         */

        int score = 80;
        if (score > 80) {
            System.out.println("Good Job");
        } else {
            System.out.println("Too bad");
        }

        int result;
        int x = 10;
        int y = -2;
        if (x > 0) {
            if (y > 0) {
                System.out.println("Good Job");
            } else {
                System.out.println("Too Bad");
            }
        }

        /*
         ASCII 코드로 'A'는 65이다.
         1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하여라.
         이때, 범위 밖의 입력이 들어오면 "잘못된 입력입니다"를 출력하라.
         */

        int n = scanner.nextInt();
        if (0 < n && n < 27) {
            System.out.println((char) (64 + n));
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        String[] fruits = {"apple", "pear", "banana"};
        for (String name : fruits) {
            System.out.println(name);
        }

        // 같은 기능을 하는 for문은
        for (int i = 0; i < fruits.length; i++) {
            String name = fruits[i];
            System.out.println(name);
        }

        // 반복문 제어
        int wallet = 20000;
        int price = 5000;
        while (true) {
            wallet -= price;
            if (wallet <= 0) {
                System.out.println("돈 다 써서 더 못사먹음 ㅠㅠ");
                // 그만먹자.(제어문)
                break;
            }
            System.out.println(String.format("1인분 먹고 %d 남음", wallet));
        }

        int[] numbers = {2, 3, 5, 6, 19, 23};
        // numbers 내부에 19가 어디있는지
        // 있다면 그 위치를, 없다면 -1을 출력하도록
        numbers = new int[]{1, 3, 4, 11, 19, 21, 23};
        int target = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 19) {
                target = i;
                // 발견 즉시 반복 종료
                break;
            }
        }
        System.out.println(target);

        // continue
        // 0 ~ 9 사이의 짝수만 출력하고 싶다.
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        // boolean[] vaccinated = {true, true, false, false, true, true, false};
        boolean[] vaccinated = {true, false, false, false, false, false, false, true, true};
        int groupCount = 0;
        for (boolean vaccine : vaccinated) {
            if (vaccine) {
                System.out.println("백신 맞으면 세지 않아요");
                continue;
            }
            groupCount++;
            // 일정 인원 이상있으면 입장불가
            if (groupCount > 5) {
                System.out.println("입장이 불가합니다...");
                break;
            }
        }
    }
}
