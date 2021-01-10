package programmers.hash;

import java.util.HashMap;

public class 마라톤완주HASH {
    public String solution(String[] participant, String[] completion) {
        HashMap<Object, String> hm = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            hm.put(i, participant[i]);
            System.out.println(hm.get(i));
        }
        return "";
    }

    public static void main(String[] args) {
        마라톤완주HASH fun = new 마라톤완주HASH();
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "mislav", "ana" };
        System.out.println(fun.solution(participant, completion));
    }
}
