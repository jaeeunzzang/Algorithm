package programmers.Level0;

public class IceAmericano {
    public int[] solution(int money){
        int[]answer = {0,0};
        int coffee = 5500;
        answer[0] = money/coffee;
        answer[1] = money%coffee;
        return answer;
    }

    public static void main(String[] args) {
        IceAmericano fn = new IceAmericano();
        int money = 15000;
        System.out.println(fn.solution(money));
    }
}
