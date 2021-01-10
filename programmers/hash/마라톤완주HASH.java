package programmers.hash;

import java.util.HashMap;

public class 마라톤완주HASH {
    public String solution(String[] participant, String[] completion) {
        HashMap<Object, String> hm = new HashMap<>();
        for (String s : participant) {
            hm.put(hashCode(), s);
        }
        System.out.println(hm);
        return "";
    }

    public static void main(String[] args) {
        마라톤완주 fun = new 마라톤완주();
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "mislav", "ana" };
        System.out.println(fun.solution(participant, completion));
    }
}
