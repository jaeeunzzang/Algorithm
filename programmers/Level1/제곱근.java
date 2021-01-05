package programmers.Level1;

public class 제곱근 {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            sqrt += 1;
            answer = sqrt * sqrt;
            return answer;
        }

        return -1;
    }

    public static void main(String[] args) {
        제곱근 fc = new 제곱근();
        System.out.println(fc.solution(3));

    }
}
