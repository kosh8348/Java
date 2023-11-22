package d3prob;

/*
1월 1일의 요일과
2월 29일의 유무가 정수, 불린으로 주어진다.

이때 1월 1일의 요일은,
0 - 월요일, 1 - 화요일, 2 - 수요일, 3 - 목요일, 4 - 금요일, 5 - 토요일, 6 - 일요일
으로 입력된다.

각 달의 1일이 무슨 요일인지 1월부터 12월까지 순서대로 출력하는 코드를 작성하시오.
 */
public class H6Control {
    public static void main(String[] args) {
        int startDay = 0; // 1월 1일의 요일
        boolean isLeapYear = false; // 윤년 여부

        // 각 달의 일수
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 각 달의 첫 날 요일 출력
        for (int i = 0; i < 12; i++) {
            // 요일 출력
            switch (startDay) {
                case 0:
                    System.out.println((i + 1) + "월의 첫 날은 월요일입니다.");
                    break;
                case 1:
                    System.out.println((i + 1) + "월의 첫 날은 화요일입니다.");
                    break;
                case 2:
                    System.out.println((i + 1) + "월의 첫 날은 수요일입니다.");
                    break;
                case 3:
                    System.out.println((i + 1) + "월의 첫 날은 목요일입니다.");
                    break;
                case 4:
                    System.out.println((i + 1) + "월의 첫 날은 금요일입니다.");
                    break;
                case 5:
                    System.out.println((i + 1) + "월의 첫 날은 토요일입니다.");
                    break;
                case 6:
                    System.out.println((i + 1) + "월의 첫 날은 일요일입니다.");
                    break;
            }

            // 윤년 처리
            if (i == 1) {
                if (isLeapYear) {
                    daysInMonth[i] = 29;
                }
            }

            // 다음 달 1일의 요일 계산
            startDay = (startDay + daysInMonth[i]) % 7;
        }


    }
}
