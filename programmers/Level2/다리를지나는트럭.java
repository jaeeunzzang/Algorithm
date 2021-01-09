package programmers.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸리는 시간
        int weight_sum = 0; // 다리위에 올라와있는 트럭의 무게 합
        Queue<Integer> bridge = new LinkedList<Integer>(); // queue 구현은 linked list로 한다.
        // 현재 다리위에 올라와있는 트럭들을 저장할 bridge 생성.

        for (int i = 0; i < truck_weights.length; i++) { // 트럭 갯수만큼 반복
            while (true) {
                if (bridge.isEmpty()) { // 다리가 비어있는 경우(제일 처음 수행)
                    bridge.add(truck_weights[i]); // 트럭을 추가해준다.
                    weight_sum += truck_weights[i]; // 무게를 더해주고
                    answer++; // 시간 증가
                    System.out.println(answer + "초:" + bridge);
                    break; // 루프 탈출 . 다음 트럭 시작
                }

                if (bridge.size() == bridge_length) { // 큐(다리)가 다리길이만큼 차 있는경우.
                    weight_sum -= bridge.poll();// 다리에서 트럭을 빼주고 그 무게만큼 sum에서 빼준다.
                    System.out.println(answer + "초:" + bridge);
                    /* poll: 가장 앞에 들어간 값을 반환하고 제거 */

                }
                if (weight_sum + truck_weights[i] <= weight) { // 다리위에 올라가있는 트럭무게의 합과 다음트럭의 무게를 더한 값이 제한무게보다 적거나 같을때
                    bridge.add(truck_weights[i]); // 큐에 트럭을 넣고
                    answer++; // 시간을 증가
                    weight_sum += truck_weights[i];
                    System.out.println(answer + "초:" + bridge);
                    break; // 다음트럭 시작
                } else if (weight_sum + truck_weights[i] > weight) { // 제한무게를 넘을때
                    answer++;
                    bridge.add(0); // 0무게 추가. 큐 size는 증가, 무게는 변화없음.
                    System.out.println(answer + "초:" + bridge);
                }

            }
        }
        // answer: 마지막 트럭이 다리에 진입한 시간
        return answer + bridge_length; // 다리길이만큼 시간 더해준다.
    }

    public static void main(String[] args) {
        다리를지나는트럭 fc = new 다리를지나는트럭();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = { 7, 4, 5, 6 };

        System.out.println(fc.solution(bridge_length, weight, truck_weights));
    }
}
