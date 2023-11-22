package d3prob;

/*
축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
남은 경기와 현재 승점과 목표 승점이 주어졌을 때,
남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
없으면 최고 승점을 출력하여라.
 */

import java.util.Scanner;

public class H2Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 남은 경기수, 현재 승점, 목표 승점 입력받기
        System.out.print("남은 경기 수를 입력하세요: ");
        int remainingGames = scanner.nextInt();     // 남은 경기수
        System.out.print("현재 승점을 입력하세요: ");
        int currentPoints = scanner.nextInt();      // 현재 승점
        System.out.print("목표 승점을 입력하세요: ");
        int targetPoints = scanner.nextInt();       // 목표 승점

        int maxPossiblePoints = currentPoints + remainingGames * 3;

        if (currentPoints >= targetPoints) {
            System.out.print("목표 승점을 넘었습니다, 최고 승점 :" + currentPoints);
        } else {
            int neededWins = (targetPoints - currentPoints) / 3;    // 필요한 승수
            int remainingNeededGames = (targetPoints - currentPoints) % 3 > 0 ? 1 : 0;  // 필요한 경기수

            int totalNeededWins = neededWins + remainingNeededGames;
            System.out.println("필요한 최소 승수: " + totalNeededWins);
        }
    }
}
