package BOJ.배열;

import java.util.Scanner;

public class Arr_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // 입력받을 값
        int[] mod = new int[42]; // 나머지 값
        int cnt = 0; // 다른 갯수

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 입력받고
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] % 42; // 나머지 값
            mod[num] += 1; // mod배열 인덱스값 증가

        }
        for (int i = 0; i < mod.length; i++) {
            if (mod[i] != 0)
                cnt += 1;
        }
        System.out.println(cnt);
    }
}
