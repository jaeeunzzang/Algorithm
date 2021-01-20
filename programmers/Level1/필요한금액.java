package programmers.Level1;

public class 필요한금액 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            if (sum >= budget) {
                break;
            }
            sum += d[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        필요한금액 fc = new 필요한금액();
        int[] d = { 1, 3, 2, 5, 4 };
        int budget = 9;
        System.out.println(fc.solution(d, budget));
    }

}
