package programmers.Level0;

import java.util.*;

public class Middel {
    public int solution(int[] array){
        int m = (array.length/2) ; //바보ㅜ 인덱스 0부터임
        Arrays.sort(array);
        return array[m];
    }
    public static void main(String[] args) {
        Middel fn = new Middel();
        int[] array = {11,2,10,7,1};
        System.out.println(fn.solution(array));
    }
}
