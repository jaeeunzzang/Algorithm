package programmers.Level1;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') { // 공백일때는 넘어감
                System.out.print(c[i]);
                continue;
            }
            c[i] += n; // 거리만큼 더해준다
            System.out.print(c[i]);
        }

        for (int i = 0; i < c.length; i++) {
            if ((int) c[i] >= 122) { // c[i]의 값이 소문자 z와 같거나, 넘어갈때
                c[i] = (char) (c[i] - 26); // 26만큼 빼준다

            }
            if (c[i] >= 90) {
                c[i] = (char) (c[i] - 26);

            }
        }

        for (char i : c) {
            answer += i; // 공백 32
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
