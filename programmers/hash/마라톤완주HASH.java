package programmers.hash;

import java.util.HashMap;

public class 마라톤완주HASH {
   public String solution(String[] participant, String[] completion) {

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
		for(int i=0;i<completion.length;i++) {
			if(set.contains(completion[i])) {
				set.remove(completion[i]);
			}
		}
		Iterator<String> it=set.iterator();
		return it.next();

		//return participant[length - 1];
	}

	public static void main(String[] args) {
		Hash fun = new Hash();
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = { "josipa", "filipa", "marina", "nikola"};
		System.out.println(fun.solution(participant, completion));
	}
}
