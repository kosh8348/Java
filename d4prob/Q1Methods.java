package d4prob;

/*
두 정수(int)를 인자로 받아,
두 정수 값의 차이의 절대값을 반환하는 메서드 "diff"를 작성하시오.

어떤 정수를 받아서 절대값을 반환하는 메서드 "abs"를 작성하시오.
 */
public class Q1Methods {
    public static int diff(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }


    }
    public static int abs(int a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static void main(String[] args) {
        int result = diff(9,4);
        System.out.println("두 정수 값의 차이의 절대값: " + result);
        int result2 = abs(-7);
        System.out.println("절대값 : " + result2);
    }
}
