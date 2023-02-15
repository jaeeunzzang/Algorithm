package programmers.Level0;

public class Pizza1 {
    public int solution(int n){
        int answer = 0;
        int cnt = n/7;
        if(n%7==0){
            answer = cnt;
        }else{
            answer = cnt+1;
        }

        return answer;
    }
    public static void main(String[] args) {
        Pizza1 fn = new Pizza1();
        System.out.println(fn.solution(22));
    }
}
