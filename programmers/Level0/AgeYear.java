package programmers.Level0;

public class AgeYear {
    public int solution(int age){
        int answer = 0;
        answer = 2022-age+1;
        return answer;
    }

    public static void main(String[] args) {
        AgeYear fn = new AgeYear();
        int age = 23;
        System.out.println(fn.solution(age));
    }
}
