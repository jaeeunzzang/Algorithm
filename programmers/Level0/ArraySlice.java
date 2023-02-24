package programmers.Level0;

import java.util.ArrayList;

public class ArraySlice {
    public ArrayList solution(int[]numbers, int num1, int num2){
        ArrayList answer = new ArrayList();
        for (int i=0;i<=num2;i++){
            if(i>=num1){
                answer.add(numbers[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ArraySlice fn = new ArraySlice();
        int[]numbers = {1,3,5};
        System.out.println(fn.solution(numbers,1,2));
    }
}
