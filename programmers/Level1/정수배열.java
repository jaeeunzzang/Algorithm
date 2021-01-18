package programmers.Level1;

import java.util.HashSet;

public class 정수배열 {
    public HashSet<Integer> solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                set.add(numbers[i] + numbers[j]);
            }
        }

        return set;
    }

    public static void main(String[] args) {
        정수배열 fc = new 정수배열();
        int[] numbers = { 5, 0, 2, 7, 1 };
        System.out.println(fc.solution(numbers));
    }

}
