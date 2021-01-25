package programmers.Level1;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reverse) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        체육복 fc = new 체육복();
        int n = 5;
        int[] lost = { 2, 4 }; // 체육복을 잃어버린 학생 번호
        int[] reverse = { 1, 3, 5 }; // 여벌체육복을 가진 학생 번호
        System.out.println(fc.solution(n, lost, reverse));
    }

}
