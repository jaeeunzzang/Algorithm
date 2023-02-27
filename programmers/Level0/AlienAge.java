package programmers.Level0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AlienAge {
    public String solution(int age){
        String answer = "";
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<=9;i++){
            int cnt = 0;
            cnt = i+97;
            map.put(i,String.valueOf((char)cnt));
        }
        ArrayList<Integer> list = new ArrayList();
        while(age>=0){
            if(age/10==0){
                list.add(age);
                break;
            }
        list.add(age%10);
        age/=10;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i =list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        for(int i:list2){
            answer+=map.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        AlienAge fn = new AlienAge();
        System.out.println(fn.solution(1));
    }
}
