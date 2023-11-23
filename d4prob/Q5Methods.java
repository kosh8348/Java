package d4prob;

/*
int[]를 인자로 받아,
순서가 반대가 되어있는 배열을 반환하는 메서드를 작성하시오.
 */
public class Q5Methods {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = reverse(originalArray);

        System.out.println("원래 배열: " + java.util.Arrays.toString(originalArray));
        System.out.println("뒤집힌 배열: " + java.util.Arrays.toString(reversedArray));
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = array[length - 1 - i];
        }

        return reversed;
    }
}
