package programmers.hash;

public class 마라톤완주 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        for (int i = 0; i < participant.length; i++) { // 4명
            for (int j = 0; j < completion.length; j++) {
                if (participant[i] != null && participant[i].equals(completion[j])) {
                    participant[i] = "";
                    completion[i] = "";
                }
            }
        }
        for (String s : participant) {
            System.out.println(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        마라톤완주 fun = new 마라톤완주();
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "mislav", "ana" };
        fun.solution(participant, completion);
    }
}
