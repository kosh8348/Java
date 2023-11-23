package d4prob;

/*
원반을 끼울 수 있는 탑 3개에,
다양한 크기의 원반 n개가, 큰것이 아래쪽에 위치하도록
하나의 탑에 끼워져 있다.
이 원반은 옮길 수 있는데,

1. 한번에 하나의 원반만을 옮길 수 있으며,
2. 작은 원반 위에 큰 원반이 잠시라도 올라가서는 안된다.

라는 조건을 지키면서 모든 원반을 한 탑에서 다른 탑으로 이동하는 문제를
하노이의 탑이라 부른다.
한 탑에서 원반을 하나 꺼내 다른 탑으로 옮긴 횟수를 센다고 했을 때,
n개의 원반을 총 몇번 옮겨야 하는지를 구하는 메서드를 작성하시오.
 */

public class H6Methods {
    public static void main(String[] args) {
        int n = 3; // 원반의 개수
        int moves = moveDisks(n, 'A', 'C', 'B');
        System.out.println("총 이동 횟수: " + moves);
    }

    // 원반을 옮기는 메서드
    public static int moveDisks(int disks, char start, char end, char auxiliary) {
        int moves = 0;
        if (disks == 1) {
            System.out.println("원반 1을 " + start + "에서 " + end + "로 이동");
            return 1;
        } else {
            moves += moveDisks(disks - 1, start, auxiliary, end);
            System.out.println("원반 " + disks + "를 " + start + "에서 " + end + "로 이동");
            moves++;
            moves += moveDisks(disks - 1, auxiliary, end, start);
        }
        return moves;
    }
}
}
