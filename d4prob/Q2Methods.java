package d4prob;

/*
String 배열을 인자로 받아 배열의 각 값을
한줄씩 출력하는 메서드 "printAll"를 작성하시오.
 */

public class Q2Methods {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java"};
        String[] names = {"Alex", "Brad", "Chad"};

        printAll(strings);
        printAll(names);

    }

    public static void printAll(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}
