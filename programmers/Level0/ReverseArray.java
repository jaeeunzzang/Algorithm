package programmers.Level0;

public class ReverseArray {
    public int[]solution (int[]num_list){
        int length = num_list.length;
        int[] answer = new int[length];
        int index = 0;

        for (int i =length-1;i>=0;i--){
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseArray fn = new ReverseArray();
        int[] num_list = {1,2,3,4,5};
        System.out.println(fn.solution(num_list));
    }
}
