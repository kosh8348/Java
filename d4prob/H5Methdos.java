package d4prob;

/*
int[]을 두개 받아,
첫번째 배열의 마지막 원소 뒤에, 두번째 배열의 첫번째 원소가 오도록
두 배열을 연결한 배열을 반환하는 메서드를 작성하시오.
 */
public class H5Methdos {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(array1, array2);

        // 결과 출력
        System.out.print("연결된 배열: ");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }

    // 두 배열을 연결하여 새로운 배열을 반환하는 메서드
    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 첫번째 배열 복사
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        // 두번째 배열 복사
        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }

        return result;
    }
}

