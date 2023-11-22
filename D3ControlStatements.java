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


    }
}
