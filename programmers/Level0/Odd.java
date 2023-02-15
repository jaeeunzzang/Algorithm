package programmers.Level0;

import java.util.ArrayList;

public class Odd {
    public ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer = new ArrayList<>();

        //arraylist 사용해서 메모리 동적할당으로,,,,,바꾸기
        int index = 0;
        for (int i=1; i<=n;i++){
            if(i%2==1){
                answer.add(index,i);
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Odd fn = new Odd();
        System.out.println((fn.solution(10)));
    }
}
