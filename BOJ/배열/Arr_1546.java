package BOJ.배열;

import java.util.Scanner;

public class Arr_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[sc.nextInt()]; // 더블형 배열선언, 시험 갯수 입력받기
        double max = 0; // 최대값
        double avg = 0; // 평균
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble(); // 시험 점수 입력받기(더블형)
        }
        sc.close();
        for (double a : arr) {
            if (a > max) {
                max = a; // 최대값 설정
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] / max) * 100; // 점수 새로구하기
            avg += arr[i]; // 점수 더해주기
        }

        avg = avg / arr.length; // 시험갯수로 나눠서 새로운 평균구하기
        System.out.println(avg);

    }
}
