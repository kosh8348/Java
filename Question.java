import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        // Q1번 사용자에게 입력을 받고,동일한 내용을 세번 출력하는 코드를 작성하시오.

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        // 동일한 내용을 세 번 출력
        System.out.println("동일한내용");
        System.out.println("동일한내용");
        System.out.println("동일한내용");

        // Q2 두개의 숫자를 입력받고 순서를 바꿔서 출력하시오.

        System.out.println("첫 번째 숫자를 입력하세요:");
        int firstNumber = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int secondNumber = scanner.nextInt();

        System.out.println("순서를 바꾼 결과:");
        System.out.println("첫 번째 숫자: " + secondNumber);
        System.out.println("두 번째 숫자: " + firstNumber);

    // ( 문자 : Spring / 정수 : int )
        System.out.println("시간을 입력하세요 (0~12):");
        int hour = scanner.nextInt();

        System.out.println("오전 또는 오후를 입력하세요 (AM 또는 PM):");
        String period = scanner.next();

        // 입력된 정보를 바탕으로 출력
        System.out.printf("%s %d시%n", period, hour);


        // Q5번 문제
        double[] grades = new double[3];
        String[] names = new String[3];

        // 실수 3개 입력 받기
        System.out.println("0.0부터 4.5 사이의 실수를 3번 입력하세요:");
        grades[0] = scanner.nextDouble();
        grades[1] = scanner.nextDouble();
        grades[2] = scanner.nextDouble();
        scanner.nextLine();

        // 이름 3개 입력 받기
        System.out.println("이름을 3번 입력하세요:");
        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();

        // 결과 출력
        System.out.println("<이름> - " + names[0] + ", <학점> - " + grades[0]);
        System.out.println("<이름> - " + names[1] + ", <학점> - " + grades[1]);
        System.out.println("<이름> - " + names[2] + ", <학점> - " + grades[2]);
    }
}