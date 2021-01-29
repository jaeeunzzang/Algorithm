package programmers.Level1;

public class 문자열반환 {

    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        문자열반환 fc = new 문자열반환();
        System.out.println(fc.solution(5));
    }
}
