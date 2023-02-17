package programmers.Level0;

public class Pizza3 {
    public int solution(int slice,int n){
        int answer=1;       // 피자의 갯수 ! 초기값은 1판
        int pizza = slice;      // 현재 피자의 조각수

        while(true){        //조건이 참일동안 반복
            if(pizza/n<1){      //조각수 나누기 인원수의 몫이 1보다 작을때
                pizza +=slice;      //현재 피자의 조각수에 잘라주는 조각수를 더해주고
                answer++;           //피자의 갯수를 1 늘려준당
            }else{              //몫이 1이거나 그보다 클때
                break;              //반복 그만하기
            }
        }
        return answer;              //피자의 갯수 반환
    }

    public static void main(String[] args) {
        Pizza3 fn = new Pizza3();
        System.out.println(fn.solution(4,4));
    }
}
