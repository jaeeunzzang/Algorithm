package programmers.Level0;

public class Protractor {
    public int solution(int angle){
        int answer =0;
        if(angle==180){
            answer = 4;
        }else if (angle<180 && angle>90){
            answer = 3;
        }else if(angle ==90){
            answer = 2;
        }else{
            answer = 1;
        }
        return answer;

    }

    public static void main(String[] args) {
        Protractor fn = new Protractor();
        System.out.println(fn.solution(91));
    }
}
