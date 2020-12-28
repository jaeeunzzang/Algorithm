package BOJ.배열;

import java.util.Scanner;

public class Arr_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10]; // 배열선언
        // int a = 150, b = 266, c = 427;
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); // 정수입력받기
        sc.close();
        int mul = a * b * c; // 곱하기
        // System.out.println("mul:" + mul);
        while (true) {
            if (mul / 10 == 0) { // 10으로 나눴을때 몫이 0이면 루프종료
                arr[mul] += 1;
                break;
            }
            int mod = mul % 10; // 나머지값 (배열인덱스로 들어갈 값)
            arr[mod] += 1;
            mul = mul / 10;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

}