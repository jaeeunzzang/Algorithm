package programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸리는 시간
        Queue<Integer> que = new LinkedList<Integer>(); // que 구현은 linked list로 한다
        /* 길이 내에서 여러트럭이 순차적으로 진입해도 제한무게를 넘지 않는경우? */
        for (int i = 0; i < truck_weights.length; i++) { // 트럭 갯수만큼 반복
            for (int j = 0; j < bridge_length; j++) { // 다리 길이만큼 반복
                if (truck_weights[i] < weight) { // 트럭무게가 제한무게보다 적을때
                    que.offer(truck_weights[i]); // 큐에 트럭을 넣고
                    answer++; // 시간을 증가
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        다리를지나는트럭 fc = new 다리를지나는트럭();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = { 7, 4, 5, 6 };

        System.out.println(fc.solution(bridge_length, weight, truck_weights));
    }
}
