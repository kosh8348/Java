package d4prob;

/*
사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
반환하는 메서드를 작성하시오.
단, 정수 범위에서만 결과를 반환합니다.
 */

import java.io.PrintStream;

public class H3Methods {
    public static void main(String[] args) {
        char operator = '*'; // 연산자 설정: +, -, *, /
        int operand1 = 10; // 첫 번째 숫자
        int operand2 = 5; // 두 번째 숫자

        int result = calculate(operator, operand1, operand2); // 연산 결과

        // 결과 출력
        if (result != Integer.MIN_VALUE) {
            System.out.println("결과: " + result);
        } else {
            System.out.println("정수 범위를 벗어난 연산입니다.");
        }
    }

    // 연산을 수행하는 메서드
    public static int calculate(char operator, int operand1, int operand2) {
        int result = 0; // 결과값을 저장할 변수

        // 연산 기호에 따라 연산 수행
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                // 나눗셈에서 0으로 나누거나, 정수범위를 벗어나면 예외 처리
                if (operand2 != 0 && !(operand1 == Integer.MIN_VALUE && operand2 == -1)) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("0으로 나눌 수 없거나 정수 범위를 벗어나는 연산입니다.");
                    return Integer.MIN_VALUE;
                }
                break;
            default:
                System.out.println("올바르지 않은 연산 기호입니다.");
                return Integer.MIN_VALUE;
        }
        return result; // 연산 결과 반환
    }
}
