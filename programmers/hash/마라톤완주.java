package programmers.hash;

public class 마라톤완주 {

    public String solution(String[] participant, String[] completion) {
        // 효율성을 고민해봅시다.
        String answer = "";
        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if (completion[i].equals(participant[j])) {
                    completion[i] = "";
                    participant[j] = "";
                    break;
                }
            }
        }
        for (int i = 0; i < participant.length; i++) {
            if (!participant[i].isEmpty()) {
                answer = participant[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        마라톤완주 fun = new 마라톤완주();
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "mislav", "ana" };
        System.out.println(fun.solution(participant, completion));
    }
}
