package programmers.hash;

import java.util.Arrays;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class 마라톤완주 {

    public String solution(String[] participant, String[] completion) {
        // 효율성을 고민해봅시다.
        String answer = "";
        Arrays.sort(participant); // 정렬 후에 찾기
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
            }
            if (completion[i].equals(participant[i])) {
                continue;
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
