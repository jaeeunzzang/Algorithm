package programmers.Level1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') { // 공백일때는 넘어감

            } else {
                c[i] += n;
            }
            System.out.print(c[i]);
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] - n <= 90) { // 처음에 들어온 문자가 대문자일때
                if (c[i] >= 90 && c[i] < 115) {
                    c[i] = (char) (c[i] - 26);
                }
            }
            if (c[i] >= 122 && c[i] < 147) {
                c[i] = (char) (c[i] - 26);
            }
        }

        for (char i : c) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        시저암호 fc = new 시저암호();
        String s = "a Z z";
        int n = 4;
        System.out.println(fc.solution(s, n)); // e D d
    }
}
