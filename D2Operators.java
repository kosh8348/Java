

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class D2Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plus = 10 + 20;
        int minus = 20 - 10;
        int mutiply = 20 * 10;
        double divide = 20 / 10;
        int modulo = 15 % 10;
        System.out.println(plus);      // 30
        System.out.println(minus);     // 10
        System.out.println(mutiply);   // 200
        System.out.println(divide);    // 2
        System.out.println(modulo);    // 5

        // 사칙연산의 우선순위
        int result = 10 + 5 * 3;
        System.out.println(result);    // 25
        // 괄호가 최우선
        result = (10 + 5) * 3;
        System.out.println(result);    // 45
        // %의 우선순위는?
        result = (10 + 5 % 3) / 3 + 2 * 3;
        System.out.println(result);



//        int notDivided = 21 / 10;
//        System.out.println(notDivided);
//
//        double[] points = new double[3];
//        double result = 0;
//
//        points[0] = scanner.nextDouble();
//        points[1] = scanner.nextDouble();
//        points[2] = scanner.nextDouble();
//
//        result = (points[0]+points[1]+points[2])/3;
//        System.out.println("세 과목의 평균 점수: "+result);
        char largeA = 'A';
        char ten = 10;
        System.out.println((char) (largeA + ten));

        int count = 0;
        count++;
        System.out.println("현재 횟수 : " + count);
        count++;
        System.out.println("현재 횟수 : " + count);
        count--;
        System.out.println("현재 횟수 : " + count);

        count = 10;
        System.out.println(++count);  // 11
        System.out.println(count++);  // 11
        System.out.println(--count);  // 11
        System.out.println(count--);  // 11

        int addTo = 1;
        addTo += 10;       // 11
        addTo *= addTo;    // 121

        addTo /= 12;  // addTo = addTo / 12;
        addTo %= 10;  // addTo = addTo % 10;
        addTo -= 20;  // addTo = addTo - 20;
        addTo *= -1;  // addTo = addTo * -1;

        System.out.println(addTo);

        // 비교 연산자
        int small1 = 10;
        int small2 = 10;
        int big = 21;
        double bigD = 21.0;
        System.out.println(small1 == small2);
        System.out.println(big == small1);
        System.out.println(big == bigD);
        System.out.println(small1 > small2);
        System.out.println(small1 >= small2);
        System.out.println(small1 != small2);
        System.out.println(small1 <= small2);
        System.out.println(small2 < bigD);

        int temperature = 38;
        int age = 20;

        // 체온은 37이하
        boolean notSick = temperature <= 37;
        // 나이는 20이상
        boolean isOfAge = age >= 20;
        // 입장 가능한가?
        boolean canEnter = notSick && isOfAge;
        System.out.println(canEnter);

        // 일요일 이거나 공휴일이다.
        // 일요일 이다.
        boolean sunday = false;
        // 공휴일 이다.
        boolean holiday = false;
        // 쉬는날이다.
        boolean canRest = sunday || holiday;
        System.out.println(canRest);

        // 아니다.
        int number = 10;
        boolean isNegative = number < 10;
        boolean isNotnegative = !isNegative;   // !=
        System.out.println(isNegative);
        System.out.println(isNotnegative);

    }
}
