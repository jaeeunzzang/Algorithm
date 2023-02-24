package programmers.Level0;

public class Lamb {
    public int solution(int n, int k){
        int answer = 0;
        int lamb = n*12000;
        int service = n/10;
        int drink = 2000;
        answer = (lamb) + (k*drink) - (service*drink);
        return answer;
    }

    public static void main(String[] args) {
        Lamb fn = new Lamb();

        System.out.println(fn.solution(64,6));
    }
}
