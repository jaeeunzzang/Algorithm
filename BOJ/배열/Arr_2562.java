package BOJ.배열;

import java.util.Scanner;

/*첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다. */
public class Arr_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, index = 0;
        int arr[] = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int a : arr) {
            index++;
            if (a == max) {
                break;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
