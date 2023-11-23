public class D4Methods {

    // main 메서드
    public static void main(String[] args) {
        System.out.println("이것도 메서드 입니다!");
        System.out.println(addTwoInt(10, 20));

        int a = 10;
        int b = 10;
        // 두개의 정수를 더하고 두배 하여라.
        int c = addAndTwice(a, b);
        System.out.println(c);
        System.out.println(threeIntAvg(a, b, c));
        int[] numbers = {-1, 0, 1};
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                index = i;
                break;
            }
        }

        int intA = 2, intB = 3;
        long longA = 2, longB = 3;
        System.out.println(add(intA, intB));
        System.out.println(add(longA, longB));
        System.out.println(add(intA, longB));
    }
    public static int add(int a, int b) {  // int + int
        return a + b;
    }

    public static long add(long a, long b) { // long + long
        return a + b;
    }

    public static long add(int a, long b) {
        return a + b;
    }

    // 정수 배열을 받아서, 1이 어디있는지 반환하거나, 없으면 -1을 반환하는 메서드
//    public static int findOne1(int[] numbers) {
//        int index = -1;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 1) {
//                index = i;
//                break;
//            }
//        }
//    }
    // 세개의 정수를 받아서, 3으로 나눈 몫을 반환하는 메서드

    public static int threeIntAvg(int a, int b, int c) {
        int sum = a + b + c;
//        int gAvg = sum / 3;
//        return  gAvg;
        return (a + b + c) / 3;


    }

    public static int addAndTwice(int a, int b) {
        // int a = 10;
        // int b = 10;
        // 두개의 정수를 더하고 두배 하여라.
        int c = (a + b) * 2;
        return c;

    }

    // 두개의 정수를 더하는 메서드
    public static int addTwoInt(int a, int b) {
        return a + b;
    }

    public static int addTwo(int a, int b) {
        return a + b;
    }

    public  static int subTwo(int a, int b) {
        return a - b;
    }



    // n! = n * (n - 1)!
    // n == 1 || n == 0 -> n! = 1

    public static int factorial(int n) {
        // 0이나 1이면 1을 반환한다.
        if (n == 1 || n == 0) {
            return 1;
        }
        // 아니면 n * f(n-1)를 반환한다.
        else {
            return n * factorial(n - 1);
        }
    }
}


