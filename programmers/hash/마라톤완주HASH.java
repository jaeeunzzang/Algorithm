package programmers.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class 마라톤완주HASH {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
			// getOrDefault(key,default)-> key값에 map을 넣어준다. value에 1 더해준다. ->중복되면 value는 2가
			// 된다.
			// System.out.println(map);
		}
		// System.out.println(map.get(key)); -> value반환
		for (String player : completion) {
			map.put(player, map.get(player) - 1); // value 를 -1씩해준다
		}
		for (String key : map.keySet()) { // map의 키 갯수만큼
			if (map.get(key) != 0) { // value가 0이 아니면
				return key;
			}
		}
		return answer;
	}

	/* hashSet은 실패. 테스트케이스 추가 필요 */
	public String solution2(String[] participant, String[] completion) {

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < participant.length; i++) {
			if (set.isEmpty()) {
				set.add(participant[i]);
				continue;
			}
			if (set.contains(participant[i])) {
				return participant[i]; // 이미 있으면 중복된거닉가 중복리턴
			}
			set.add(participant[i]); // add 해주고
		}
		for (int i = 0; i < completion.length; i++) {
			if (set.contains(completion[i])) {
				set.remove(completion[i]);
			}
		}
		Iterator<String> it = set.iterator();
		return it.next();

		// return participant[length - 1];
	}

	public static void main(String[] args) {
		마라톤완주HASH fun = new 마라톤완주HASH();
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(fun.solution(participant, completion));
	}
}
