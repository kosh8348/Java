package d4prob;

/*
int[]을 인자로 받아,

1. 배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
2. 배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
3. 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"

메서드를 각각 작성하시오.
 */
public class H4Methods {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 7, 5, 9, 2, 8, 4, 6};

        int maxIndex = maxWhere(numbers);
        int minIndex = minWhere(numbers);
        int diff = maxDiff(numbers);

        System.out.println("최댓값 위치: " + maxIndex);
        System.out.println("최솟값 위치: " + maxIndex);
        System.out.println("최댓값과 최솟값의 차이: " + diff);
    }

    // 배열의 값들 중 최댓값의 위치를 반환하는 메서드
    public static int maxWhere(int[] array) {
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int minWhere(int[] array) {
        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int maxDiff(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }
}
