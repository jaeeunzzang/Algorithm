
import java.util.*;

public class Kakao {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int index = 0;
        Stack<Integer> stack = new Stack<Integer>(); // 바구니

        for (int i = 0; i < moves.length; i++) { // 작동횟수만큼
            for (int j = 0; j < board.length; j++) { // 게임판크기만큼(정사각)
                if (board[j][j] != 0) {

                } else {

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Kakao kakao = new Kakao();
        int board[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };
        int moves[] = { 1, 5, 3, 5, 1, 2, 1, 4 };
        System.out.println(kakao.solution(board, moves));
    }
}
