package programmers.Level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public int solution(int[] array){
        int length = array.length;
        int max = -1;
        int answer = -1;
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(array);

        if(length == 1){
            return array[0];
        }else if(length == 2){
            if(array[0] != array[1]){
                return -1;
            }else{
                return array[0];
            }
        }
    /* 맵에 array 값 = key, 빈도수 = value 넣기*/
        for(int i:array){
            if(map.get(i)==null){
                int cnt = 0;
                for (int j :array){
                    if(i == j){
                        cnt++;
                        }
                    map.put(i,cnt);
                    }
                }
            }
       //     System.out.println(map);

        /*동일한 빈도수를 가진 값이 있는지 확인 */
        for(int i: map.keySet()){
                if(map.get(i) > max){
                    answer = i; //값
                    max = map.get(i); //빈도수
                }
                else if(max == map.get(i)){ //빈도수가 같다면?
                    answer = -1;
                }
           // System.out.println(i);
        }
       // System.out.println(max);
       // System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        Frequency fn = new Frequency();
        int[] array = {4,4,8,2,4,3};
        fn.solution(array);
    }
}
