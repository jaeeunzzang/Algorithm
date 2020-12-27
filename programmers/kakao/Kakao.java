package programmers.kakao;

import java.util.*;

public class Kakao {

	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<Integer>(); // 바구니

		for (int i = 0; i < moves.length; i++) { // 작동횟수만큼
			for (int j = 0; j < board.length; j++) { // 게임판크기만큼(정사각)
				System.out.println(moves[i] + ":" + board[j][moves[i] - 1]);
				if (board[j][moves[i] - 1] != 0) { // 각 열(moves)의 깊이 탐색(위에서 아래로)
					if (stack.isEmpty()) { // 바구니가 비어있으면
						stack.push(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
						System.out.println("first push: " + stack);
						break;
					} else { // 비어있지 않을때
						if (stack.peek() == board[j][moves[i] - 1]) {// 스택의 top값과 보드의 값이 같으면
							System.out.println("stack:" + stack);
							System.out.println("moves:" + moves[i]);
							board[j][moves[i] - 1] = 0;
							stack.pop(); // pop하고
							answer += 2; // +2해준다..
							System.out.println("pop stack:" + stack);
							break;
						} else { // top값과 보드의 값이 같지 않으면
							stack.push(board[j][moves[i] - 1]); // 맨위에 있는거 스택에 넣어준다
							board[j][moves[i] - 1] = 0; // 인형을 빼간곳은 0으로 바꿔준다
							System.out.println("push stack:" + stack);
							break; // break해서 다음 moves로 간다

						}
					}
					// 배열은 0부터 시작이니까 moves[i]-1로 해준다
					// 0이 아니면(인형이 있으면)
					// board[0][0]
					// board[1][0]
					// board[2][0]

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
