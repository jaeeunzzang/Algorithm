package programmers.Level1;

import java.util.Scanner;

public class 하샤드수 {

    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int cnt = 0;
        int sum = 0;
        while (true) {
            if (num == 0) {
                break;
            }
            sum += num % 10;
            num = num / 10;
            cnt++;
        }
        System.out.println(sum);
        return answer;
    }

    public static void main(String[] args) {
        하샤드수 fc = new 하샤드수();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fc.solution(x));
    }
}
