package programmers.Level1;

import java.util.HashSet;

public class 정수배열 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                set.add(numbers[i] + numbers[j]);
            }
        }
        for (int i = 0; i < set.size(); i++) {

        }

        return answer;
    }

    public static void main(String[] args) {
        정수배열 fc = new 정수배열();
        int[] numbers = { 2, 1, 3, 4, 1 };
        System.out.println(fc.solution(numbers));
    }

}
