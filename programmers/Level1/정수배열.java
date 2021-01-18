package programmers.Level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 정수배열 {
    public HashSet<Integer> solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                set.add(numbers[i] + numbers[j]);
            }
        }
        List li = new ArrayList<>(set);
        // li.sort(asc);
        return set;
    }

    public static void main(String[] args) {
        정수배열 fc = new 정수배열();
        int[] numbers = { 0, 0 };
        System.out.println(fc.solution(numbers));
    }

}
