package programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸리는 시간
        int weight_sum = 0; // 다리위에 올라와있는 트럭의 무게 합
        Queue<Integer> bridge = new LinkedList<Integer>(); // que 구현은 linked list로 한다.
        // 현재 다리위에 올라와있는 트럭의 리스트를 저장할 bridge 생성.

        /* 길이 내에서 여러트럭이 순차적으로 진입해도 제한무게를 넘지 않는경우? */
        for (int i = 0; i < truck_weights.length; i++) { // 트럭 갯수만큼 반복
            while (true) { // 반복
                if (bridge.isEmpty()) { // 다리가 비어있는 경우
                    bridge.add(truck_weights[i]); // 트럭을 추가해준다.
                    weight_sum += truck_weights[i];
                    answer++; // 시간 증가
                    break; // 루프 탈출 . 다음 트럭 시작
                }
                if (bridge.size() == bridge_length) { // 다리 길이만큼 트럭이 다 올라와있는경우
                    weight_sum -= bridge.poll();// 다리에서 트럭을 빼주고 그 무게만큼 sum에서 빼준다.
                    /* poll: 가장 앞에 들어간 값을 반환하고 제거 */

                }
                if (truck_weights[i] < weight) { // 트럭무게가 제한무게보다 적을때
                    bridge.offer(truck_weights[i]); // 큐에 트럭을 넣고
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
